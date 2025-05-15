package com.interview_preparation.keep.growing.util.warm.up;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class TEST_STOCK_API {
    public static void main(String[] args) throws IOException {
        System.out.println("hello stock api test...");

        Stock sensex = YahooFinance.get("^BSESN");
        System.out.println("sensex: history: \n "+ sensex.getHistory().toString());
        System.out.println(sensex.getQuote().getPrice());
    }

}
