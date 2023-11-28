package day7;

public class Player {
    private int stamina;
    private  final  int MAX_STAMINA = 100;
    private  final int MIN_STAMINA = 0;
    private static int countPlayers;


    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        if (getStamina() >= 90 || getStamina() <= MAX_STAMINA){
            this.stamina = stamina;
        }else {
           throw new RuntimeException("диапазон возможных значений должен быть от 90 до 100");
        }
        if (countPlayers < 6) countPlayers++;
    }
    public  void run() {
        if (getStamina() == MIN_STAMINA) {
            return;
        }
        System.out.println("игрок бежит");
        stamina = getStamina() - 1;
        if (getStamina() == MIN_STAMINA) {
            countPlayers = countPlayers - 1;
            System.out.println("игрок ушёл с поля");
        }
    }
    public static void info() {
        int max = 6;
        int diff = max - countPlayers;
        if (diff == 0) {
            System.out.println("на поле нет свободных мест");
        }
        if (diff > 0) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест \n", diff
            );
        }
    }
}
