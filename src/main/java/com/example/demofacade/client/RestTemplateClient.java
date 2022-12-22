package com.example.demofacade.client;

import com.example.demofacade.client.model.response.account.AccountResponse;
import com.example.demofacade.client.model.response.balance.BalanceResponse;
import com.example.demofacade.client.model.response.card.CardResponse;
import com.example.demofacade.client.model.response.deposit.Deposit;
import com.example.demofacade.client.model.response.deposit.DepositResponse;
import com.example.demofacade.client.model.response.invest.PortfolioResponse;
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
                restTemplateProperties.getCards() + "/" + userId,
                CardResponse.class
        );
    }

    public ResponseEntity<AccountResponse> getAccounts(String userId) {
        return restTemplate.getForEntity(
                restTemplateProperties.getAccounts() + "/" + userId,
                AccountResponse.class
        );
    }

    public ResponseEntity<DepositResponse> getDeposits(String userId) {
        return restTemplate.getForEntity(
                restTemplateProperties.getDeposits() + "/" + userId,
                DepositResponse.class
        );
    }

    public ResponseEntity<PortfolioResponse> getInvestment(String userId) {
        return restTemplate.getForEntity(
                restTemplateProperties.getInvestment() + "/" + userId,
                PortfolioResponse.class
        );
    }

    public ResponseEntity<BalanceResponse> getBalance(String userId) {
        return restTemplate.getForEntity(
                restTemplateProperties.getBalance() + "/" + userId,
                BalanceResponse.class
        );
    }
}
