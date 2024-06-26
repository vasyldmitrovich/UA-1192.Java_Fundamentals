package com.softserve.GP;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRates {

    public static Map<String, Double> getRates() {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("CAD", 1.25);
        exchangeRates.put("AUD", 1.35);
        exchangeRates.put("CHF", 0.92);
        exchangeRates.put("CNY", 6.45);
        exchangeRates.put("INR", 74.0);
        return exchangeRates;
    }
}


