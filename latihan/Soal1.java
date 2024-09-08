package latihan;
import java.util.Scanner;
public class Soal1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input 2 bilangan
            System.out.print("Masukkan bilangan pertama: ");
            double num1 = input.nextDouble();

            System.out.print("Masukkan bilangan kedua: ");
            double num2 = input.nextDouble();

            // Menentukan bilangan terbesar
            double terbesar;

            if (num1 >= num2) {
                terbesar = num1;
            } else {
                terbesar = num2;
            }

            // Menampilkan bilangan terbesar
            System.out.println("Bilangan terbesar adalah: " + terbesar);

            input.close();


        }
    }


