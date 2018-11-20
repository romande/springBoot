package com.example.demo.util.synchronization;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class CustomLock {

    private long time;

    private int locks = 0;

    /**
     * seconds为自定解锁时长
     * @param seconds
     */
    public void lock(int seconds) {
        synchronized (this) {
            long currentTime = new Date().getTime();
            long interval = (currentTime - time)/1000;
            if(interval > seconds) {
                locks = 0;
            }

            while (locks > 0) {// 如果其他线程已经加锁,且不是当前线程自己加的锁,则等待
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }

            // 如果自己已经获得锁,lock数就别增加了
            if(locks > 0) {
                return;
            }
            locks++;
            time = new Date().getTime();
        }
    }

    public void unlock() {
        synchronized (this) {
            if(locks == 0 ) {// 没有加锁,或者当前加锁的线程不是自己,不需要解锁
                return;
            }
            locks--;
            notifyAll();
        }
    }
}
