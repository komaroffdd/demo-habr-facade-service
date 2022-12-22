package com.example.demofacade.controller;

import com.example.demofacade.domain.TotalMoney;
import com.example.demofacade.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RequestMapping("api/v1/demo")
@RestController
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/{id}")
    public ResponseEntity<String> demoGetRequest(@PathVariable("id") String userId) {
        TotalMoney calculate = demoService.calculate(userId);
        int result = calculate.getResult();
        String responseBody = "У вас вот столько :" + result + " руб";
        return ResponseEntity.ok(responseBody);
    }
}
