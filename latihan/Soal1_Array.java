package latihan;
import java.util.Scanner;
public class Soal1_Array {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Menentukan jumlah bilangan yang akan dimasukkan
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();

            // Memeriksa agar jumlah bilangan lebih dari 0
            if (n <= 0) {
                System.out.println("Jumlah bilangan harus lebih dari 0.");
                input.close();
                return;
            }

            // Membuat array untuk menyimpan bilangan
            double[] bilangan = new double[n];

            // Input bilangan
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                bilangan[i] = input.nextDouble();
            }

            // Menentukan bilangan terbesar
            double terbesar = bilangan[0];

            for (int i = 1; i < n; i++) {
                if (bilangan[i] > terbesar) {
                    terbesar = bilangan[i];
                }
            }

            // Menampilkan bilangan terbesar
            System.out.println("Bilangan terbesar adalah: " + terbesar);

            input.close();
        }
    }

