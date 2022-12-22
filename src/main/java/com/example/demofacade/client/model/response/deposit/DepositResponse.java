package com.example.demofacade.client.model.response.deposit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepositResponse {
    private List<Deposit> deposits;
}
