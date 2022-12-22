package com.example.demofacade.client;

import com.example.demofacade.client.model.response.card.CardResponse;
import com.example.demofacade.config.properties.RestTemplateProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
@RequiredArgsConstructor
public class RestTemplateClient {
    private final RestTemplate restTemplate;
    private final RestTemplateProperties restTemplateProperties;


    public ResponseEntity<CardResponse> getCards(String userId) {
        return restTemplate.getForEntity(
                restTemplateProperties.getCards(),
                CardResponse.class
        );
    }
}
