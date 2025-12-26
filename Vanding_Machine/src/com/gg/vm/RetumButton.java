package com.gg.vm;

public class RetumButton {
    private Coin coin;
    private DisplaPanel displaPanel;

    public RetumButton(Coin coin, DisplaPanel displaPanel) {
        this.coin = coin;
        this.displaPanel = displaPanel;
    }

    public void press() {
        int refund = coin.getAmount();
        coin.reset();
        displaPanel.showMessage("잔환된 금액 : " + refund + "원");
    }
}
