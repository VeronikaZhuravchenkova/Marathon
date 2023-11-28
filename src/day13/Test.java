package day13;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("Veronika");
        User u2 = new User("Stepan");
        User u3 = new User("Kate");

      u1.sendMessage(u2, "Привет");
      u2.sendMessage(u1, "Привет");
      MessageDataBase.showDialog(u1,u2);




    }
}
