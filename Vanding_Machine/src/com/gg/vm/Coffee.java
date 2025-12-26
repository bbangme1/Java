package com.gg.vm;

public class Coffee {
    private String neme;
    private int price;

    // 커피 생성자
    public Coffee(String neme, int price) {
        this.neme = neme;
        this.price = price;
    }

    public String getNeme() {
        return neme;
    }

    public int getPrice() {
        return price;
    }

}
