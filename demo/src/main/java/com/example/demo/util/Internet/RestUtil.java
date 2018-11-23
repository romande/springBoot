package com.example.demo.util.Internet;

import com.example.demo.dao.entity.LoginUser;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * rest请求
 */
@Component
public class RestUtil {
    private RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity doGET() {
        String url = "http://localhost:8888/index/back";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> httpEntity = new HttpEntity<>( headers);
        ResponseEntity<LoginUser> responseEntity = restTemplate.exchange(url,HttpMethod.GET,httpEntity, LoginUser.class);
        return responseEntity;
    }


}
