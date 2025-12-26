package com.gg.vm;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VandingMachine {
    private Coin coin;
    private DisplaPanel displaPanel;
    private RetumButton retumButton;
    private ProductOutput productOutput;
    private List<Coffee> menu;

    public VandingMachine(Coin coin, DisplaPanel displaPanel, RetumButton retumButton, ProductOutput productOutput) {
        this.coin = coin;
        this.displaPanel = displaPanel;
        this.retumButton = retumButton;
        this.productOutput = productOutput;

        // 커피 메뉴 구성
        menu = new ArrayList<>();
        menu.add(new Coffee("아메리카노", 1000));
        menu.add(new Coffee("카페라뗴", 1500));
        menu.add(new Coffee("카푸치노", 2000));
    }

    public void showMenu() {
        displaPanel.showMenu(menu, coin.getAmount());
    }

    public void insertCoin(int value) {
        coin.insert(value);
        displaPanel.showMessage("현재 잔액 :" + coin.getAmount() + "원");
    }

    // 메뉴 선택
    public void selectCoffee(int index) {
        if (index < 0 || index >= menu.size()) {
            displaPanel.showMessage("잘못된 메뉴 선택입니다.");
            return;
        }

        Coffee coffee = menu.get(index);

        if (coin.getAmount() >= coffee.getPrice()) {
            // 커피판매 처리
            coin.insert(-coffee.getPrice());
            productOutput.dispense(coffee);
            displaPanel.showMessage("잔액 " + coin.getAmount() + "원");
        } else {
            displaPanel.showMessage("잔액부족 " + coffee.getPrice() + "원이 필요합니다.");
        }
    }

    // 반환버튼 기능
    public void pressReturnButton() {
        retumButton.press();
    }

    public static void main(String[] args) {
        //무대, 연출
        Scanner kbd = new Scanner(System.in);
        Coin coin = new Coin();
        DisplaPanel displaPanel = new DisplaPanel();
        ProductOutput productOutput = new ProductOutput();
        RetumButton retumButton = new RetumButton(coin, displaPanel);

        VandingMachine vm = new VandingMachine(coin, displaPanel, retumButton, productOutput);

        // 무한반복 구조
        while (true) {
            vm.showMenu();
            System.out.println("1. 동전 투입 | 2. 커피 선택 | 3. 반환버튼 | 0. 종료");
            System.out.println("선택 : ");
            int choice = kbd.nextInt();

            switch (choice) {
                case 0:
                    System.out.println(" 자판기를 종료합니다.");
                    return;
                case 1:
                    System.out.println(" 투입한 금액 입력 : ");
                    int money = kbd.nextInt();
                    vm.insertCoin(money);
                    break;
                case 2:
                    System.out.println("메뉴 선택 : ");
                    int coffeeIndex = kbd.nextInt();
                    vm.selectCoffee(coffeeIndex);
                    break;
                case 3:
                    vm.pressReturnButton();
                    break;
                default:
                    System.out.println(" 잘못된 메뉴 선택입니다.");
            }

            System.out.println("계속하려면 Enter를 누르세요");
            kbd.nextLine();

        }
    }

}
