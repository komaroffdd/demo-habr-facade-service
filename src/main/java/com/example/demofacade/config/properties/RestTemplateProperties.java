package com.example.demofacade.config.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app.rest")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestTemplateProperties {
    private String cards;
    private String accounts;
    private String deposits;
    private String investment;
    private String balance;
}
