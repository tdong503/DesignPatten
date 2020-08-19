package com.example.DesignPatten.Adapter;

public class Alipay implements Pay {

    @Override
    public boolean addPayment() {
        return false;
    }

    @Override
    public boolean submit() {
        return false;
    }

    @Override
    public boolean getInfo() {
        return false;
    }

    @Override
    public boolean refund() {
        return false;
    }
}
