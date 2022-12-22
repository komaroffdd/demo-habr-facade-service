package com.example.demofacade.client.model.response.balance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BalanceResponse {
    private List<Balance> balances;
}
