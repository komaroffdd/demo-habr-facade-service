package com.example.demofacade.service;

import com.example.demofacade.client.RestTemplateClient;
import com.example.demofacade.client.model.response.account.AccountResponse;
import com.example.demofacade.client.model.response.balance.BalanceResponse;
import com.example.demofacade.client.model.response.card.Card;
import com.example.demofacade.client.model.response.card.CardResponse;
import com.example.demofacade.client.model.response.deposit.DepositResponse;
import com.example.demofacade.client.model.response.invest.PortfolioResponse;
import com.example.demofacade.domain.TotalMoney;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class DemoService {
    private final RestTemplateClient restTemplateClient;


    public TotalMoney calculate(String userId) {
        ResponseEntity<CardResponse> cards = restTemplateClient.getCards(userId);
        ResponseEntity<AccountResponse> accounts = restTemplateClient.getAccounts(userId);
        ResponseEntity<DepositResponse> deposits = restTemplateClient.getDeposits(userId);
        ResponseEntity<PortfolioResponse> investment = restTemplateClient.getInvestment(userId);
        ResponseEntity<BalanceResponse> balance = restTemplateClient.getBalance(userId);
        return null;
    }

}
