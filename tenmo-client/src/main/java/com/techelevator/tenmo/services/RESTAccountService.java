package com.techelevator.tenmo.services;

import com.techelevator.tenmo.model.Account;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import java.math.BigDecimal;

public class RESTAccountService {

    public static String AUTH_TOKEN = "";
    private final String BASE_URL;
    private final RestTemplate restTemplate = new RestTemplate();
    private Account account = new Account();

    public RESTAccountService(String url){
        this.BASE_URL = url;
    }

    private HttpEntity makeAuthEntity() {
        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(AUTH_TOKEN);
        HttpEntity entity = new HttpEntity<>(headers);
        return entity;
    }

    public String getAccountBalance(){
        String balance = null;

        try{
            balance = restTemplate.exchange(BASE_URL + "account/" + account.getAccountId(), HttpMethod.GET, makeAuthEntity(), String.class).getBody();
        } catch (RestClientResponseException ex){
            System.out.println(ex.getMessage());
        }
        return balance;
    }

}
