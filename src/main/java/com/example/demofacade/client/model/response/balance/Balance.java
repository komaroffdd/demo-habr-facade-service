package com.example.demofacade.client.model.response.balance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Balance {
    private String type;
    private String id;
    private double amount;
    private String currency;
}
