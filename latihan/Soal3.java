package latihan;
import java.util.Scanner;
public class Soal3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Memasukkan dua bilangan
            System.out.print("Masukkan bilangan pertama: ");
            double num1 = input.nextDouble();

            System.out.print("Masukkan bilangan kedua: ");
            double num2 = input.nextDouble();

            // Memilih operasi
            System.out.print("Pilih operasi (+, -, *, /, %): ");
            char operation = input.next().charAt(0);

            double result;

            // Melakukan operasi berdasarkan input pengguna
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Hasil: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Hasil: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Hasil: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Hasil: " + result);
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Hasil: " + result);
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol.");
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
            }

            // Menutup Scanner
            input.close();
        }
    }


