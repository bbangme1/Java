package com.gg.vm;

public class ProductOutput {
    public void dispense(Coffee coffee) {
        System.out.println("[출력]" + coffee.getNeme() + "가 나왔습니다.");
    }
}
