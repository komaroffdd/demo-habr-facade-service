package com.example.demofacade.client.model.response.invest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Portfolio {
    private int id;
    private String liquidationValue;
    private String assetsValue;
    private String freeValue;
    private String reservedValue;

}
