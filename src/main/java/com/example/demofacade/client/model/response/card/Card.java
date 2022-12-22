package com.example.demofacade.client.model.response.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {
    private int id;
    private String cardId;
    private String cardName;

}
