package day11;

public class Task1 {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Picker picker = new Picker(wareHouse);
        Courier courier = new Courier(wareHouse);

        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();

        }
        picker.bonus();
        picker.bonus();
        System.out.println(wareHouse + " " + picker + " " + courier);



    }
}
