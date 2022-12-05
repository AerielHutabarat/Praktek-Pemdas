import java.util.Scanner;

public class SifatBenda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inte = input.nextInt();
        double db = input.nextDouble();
        double db1 = input.nextDouble();
        int inte1 = input.nextInt();

        System.out.println(inte+ " termasuk bilangan integer");
        System.out.println(db+ " bilangan double");
        System.out.print("Sehingga hasil jumlahnya ");hasil(inte, db);
        System.out.println(db1+" termasuk bilangan double");
        System.out.println(inte1+ " bilangan integer");
        System.out.print("Sehingga hasil jumlahnya ");hasil1(db1, inte1);
    }


    static void hasil(int inte,double db) {
        System.out.println(""+inte+db);

    }
    static void hasil1(double db1, int inte1) {
        System.out.println(""+(int)db1+inte1);

    }

}
