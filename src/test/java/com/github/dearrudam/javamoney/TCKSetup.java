package com.github.dearrudam.javamoney;

import org.javamoney.tck.JSR354TestConfiguration;

import javax.money.MonetaryOperator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TCKSetup implements JSR354TestConfiguration {

    @Override
    public Collection<Class> getAmountClasses() {
        return Collections.emptyList();
    }

    @Override
    public Collection<Class> getCurrencyClasses() {
        try{
            return Arrays
                    .asList(new Class[] { Class.forName("com.github.dearrudam.javamoney.internal.JDKCurrencyAdapter")});
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("Currency class not loadable: com.github.dearrudam.javamoney.internal.JDKCurrencyAdapter");
        }
    }

    @Override
    public Collection<MonetaryOperator> getMonetaryOperators4Test() {
        return Collections.emptyList();
    }
}
