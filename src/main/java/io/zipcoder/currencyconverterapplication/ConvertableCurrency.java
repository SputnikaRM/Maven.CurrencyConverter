package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double conversion = currencyType.getRate() / getCurrencyType().getRate();
        return conversion;
    }

    CurrencyType getCurrencyType();
}
