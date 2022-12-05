import java.util.*;
import java.lang.Math;
public class BMI {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double Berat, Tinggi, BMI;

        System.out.println("Menghitung BMI (Body  Mass Index)");
        System.out.print("Berat badan (Kg):");
        Berat = input.nextDouble();
        System.out.print("Tinggi badan (Cm):");
        Tinggi = input.nextDouble();
        BMI = Berat / (Tinggi / 100 * Tinggi / 100);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else {
            if (BMI >= 18.5 && BMI < 25.0) {
                System.out.println("Normalweight");
            } else {
                if (BMI >= 25.0 && BMI < 29.0) {
                    System.out.println("Overweight");
                } else {
                    if (BMI >= 29.0 && BMI < 35.0) {
                        System.out.println("Obese  (Class I)");
                    } else {
                        if (BMI >= 35.0 && BMI < 40.0) {

                            System.out.println("Obese (Class II)");
                        } else {
                            if (BMI > 40.0) {
                                System.out.println("Obese (Class III)");
                            }
                        }
                    }
                }
            }
        }
    }
}
