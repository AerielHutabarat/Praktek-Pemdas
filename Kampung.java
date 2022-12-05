import java.util.Scanner;
public class Kampung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int AB = input.nextInt();
        int AC = input.nextInt();
        int BD = input.nextInt();
        int CD = input.nextInt();

        int dis1 = AB+BD;
        int dis2 = AC+CD;
        if (dis1 >=0 && dis2 >=0 ) {
            if (dis1<dis2) {System.out.println("Jalur terdekat : ABD\nDengan jarak   : "+(dis1));}
            else if (dis1>dis2){System.out.println("Jalur terdekat : ACD\nDengan jarak   : "+(dis2));}
        }



    }

}
