package day11;

public class Courier implements Worker {
    private int salary;
    private WareHouse wareHouse;

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public Courier(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
       wareHouse.setBalance(wareHouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (wareHouse.getBalance() > 1000000) {
            salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
