import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.println("Selamat datang di Kalkulator Sederhana!");
        out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

         out.print("Masukkan angka kedua: ");
                 double angka2 = input.nextDouble();


        double hasil = 0.0;

       switch (operator) {
                   case '+':
                       hasil = angka1 + angka2;
                       break;
                   case '-':
                       hasil = angka1 - angka2;
                       break;
                   case '*':
                       hasil = angka1 * angka2;
                       break;
                   case '/':
                       if (angka2 != 0) {
                           hasil = angka1 / angka2;
                       } else {
                           out.println("Kesalahan: Pembagian oleh nol tidak diizinkan.");
                           return;
                       }
                       break;
                   default:
                       out.println("Kesalahan: Operator tidak valid.");
                       return;
               }

        out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
