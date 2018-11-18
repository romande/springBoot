package com.example.demo.util.Internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * 获取网络相关的信息(不稳定)
 * 1、内网ipV4 localIpAddress
 * 2、外网ipV4 outIpAddress
 */
public class InternetUtil {

    /**
     * get inner internet IP address
     * @return
     */
    public static String getLocalIpV4(){
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * get out internet IP address
     * @return
     */
    public static String getOutIpV4(){
        try {
            URL url = new URL("http://www.ip138.com/ips138.asp");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String s = "";
            StringBuffer sb = new StringBuffer("");
            String webContent = "";
            while ((s = br.readLine()) != null) sb.append(s + "\r\n");
            br.close();

            webContent = sb.toString();
            webContent = webContent.substring(webContent.indexOf("<div"));

            int start = webContent.indexOf("[")+1;
            int end = webContent.indexOf("]");
            return webContent.substring(start,end);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args){
        System.out.println(getOutIpV4());
    }

}
