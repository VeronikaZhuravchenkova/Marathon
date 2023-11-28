package day11;

public class Picker implements Worker {
    private int salary;
    private WareHouse wareHouse;

    public Picker(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
       wareHouse.setCountOrder(wareHouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (wareHouse.getCountOrder() > 1500) {
            salary = salary  * 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
