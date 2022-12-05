import java.util.Scanner;
public class Hari {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int day = input.nextInt();
        int next = input.nextInt();
        int total = (day+next)%7;

        switch (day) {
            case 1: System.out.println("Senin");
                break;
            case 2 : System.out.println("Selasa");
                break;
            case 3 : System.out.println("Rabu");
                break;
            case 4 : System.out.println("Kamis");
                break;
            case 5 : System.out.println("Jum'at");
                break;
            case 6 : System.out.println("Sabtu");
                break;
            case 7 : System.out.println("Minggu");
                break;
        }
        switch (total) {
            case 1: System.out.println("Senin");
                break;
            case 2: System.out.println("Selasa");
                break;
            case 3: System.out.println("Rabu");
                break;
            case 4: System.out.println("Kamis");
                break;
            case 5: System.out.println("Jum'at");
                break;
            case 6: System.out.println("Sabtu");
                break;
            case 7:System.out.println("Minggu");
        }

    }

}
