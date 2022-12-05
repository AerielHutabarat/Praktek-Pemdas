import java.util.Scanner;

public class Revers {

    public static void main(String[] args) {
        Uno();

    }
    private static void Uno() {

        Scanner input =new Scanner(System.in);
        int user = input.nextInt();

        StringBuffer play = new StringBuffer(String.valueOf(user));
        StringBuffer revers=play.reverse();
        System.out.println(revers);
    }



}
