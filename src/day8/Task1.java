package day8;

public class Task1 {
    public static void main(String[] args) {
        /*String numbers = "";
        long start = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers);
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println(diff);*/


        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println(diff);


    }
}
