package day11;

public class WareHouse {
    protected int countOrder;
    protected int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
