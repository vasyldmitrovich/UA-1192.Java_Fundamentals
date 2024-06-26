package com.softserve.GP;

import java.util.Map;
import java.util.regex.Pattern;

public class Validator {

    private static final Map<String, Double> exchangeRates = ExchangeRates.getRates();

    public static boolean isValidAmount(String amount) {
        return amount.matches("^\\d+(\\.\\d+)?$");
    }

    public static boolean isValidCurrencyCode(String currencyCode, String pattern) {
        return Pattern.matches(pattern, currencyCode) && exchangeRates.containsKey(currencyCode);
    }
}


