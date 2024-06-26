package com.softserve.GP;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverterApp {
    private static final Map<String, Double> exchangeRates = ExchangeRates.getRates();
    private static final String currencyCodePattern = "^[A-Z]{3}$";

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        String amountInput = scanner.nextLine();

        if (!Validator.isValidAmount(amountInput)) {
            System.out.println("Invalid amount entered. Please enter a valid number.");
            return;
        }

        double amount = Double.parseDouble(amountInput);

        System.out.print("Enter source currency code (e.g., USD): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        if (!Validator.isValidCurrencyCode(sourceCurrency, currencyCodePattern)) {
            System.out.println("Invalid source currency code.");
            return;
        }

        System.out.print("Enter target currency code (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        if (!Validator.isValidCurrencyCode(targetCurrency, currencyCodePattern)) {
            System.out.println("Invalid target currency code.");
            return;
        }

        double convertedAmount = CurrencyConverterUtil.convertCurrency(amount, sourceCurrency, targetCurrency);
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}

