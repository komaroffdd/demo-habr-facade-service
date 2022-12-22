package com.example.demofacade.service;

import com.example.demofacade.client.RestTemplateClient;
import com.example.demofacade.domain.TotalMoney;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class DemoService {
    private final RestTemplateClient restTemplateClient;


    public TotalMoney calculate(String userId) {

    }

}
