import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();

        double j = a+(b*15/100)-100000;

        System.out.println(j);




    }
}