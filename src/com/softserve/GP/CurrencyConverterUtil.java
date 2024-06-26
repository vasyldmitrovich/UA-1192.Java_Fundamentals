package com.softserve.GP;

import java.util.Map;

public class CurrencyConverterUtil {

    private static final Map<String, Double> exchangeRates = ExchangeRates.getRates();

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        return amount * (targetRate / sourceRate);
    }
}


