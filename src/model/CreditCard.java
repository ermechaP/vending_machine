package model;

public class CreditCard {
    private int amount;
    public CreditCard(int amount){
        this.amount=amount;
    }

    public int getAmount() {
       if(this.amount<20){
           return 0;
       }else{
           this.setAmount(this.amount-20);
           return 20;
       }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
