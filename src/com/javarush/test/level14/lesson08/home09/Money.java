package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double pay=2.2;
    public Money(double amount)
    {
    }

    public double getAmount(){
        return this.pay;
    }

    public abstract String getCurrencyName();
}

