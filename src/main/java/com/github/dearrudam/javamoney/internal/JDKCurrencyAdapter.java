package com.github.dearrudam.javamoney.internal;

import javax.money.CurrencyContext;
import javax.money.CurrencyUnit;

public class JDKCurrencyAdapter implements CurrencyUnit {

    @Override
    public String getCurrencyCode() {
        return null;
    }

    @Override
    public int getNumericCode() {
        return 0;
    }

    @Override
    public int getDefaultFractionDigits() {
        return 0;
    }

    @Override
    public CurrencyContext getContext() {
        return null;
    }

    @Override
    public int compareTo(CurrencyUnit other) {
        return 0;
    }
}
