import java.util.Scanner;
public class Kapitalisasi {

    public static void main(String[] args) {
        Cap();
    }
    private static void Cap() {
        Scanner input = new Scanner(System.in);
        String let = input.nextLine();

        String Caplet = let.substring(0,1).toUpperCase()+ let.substring(1).toLowerCase();
        System.out.println(Caplet);

    }


}




