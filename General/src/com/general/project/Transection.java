package com.general.project;

public class Transection {
    private String type;
    private int amount;

    public Transection(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transection{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
