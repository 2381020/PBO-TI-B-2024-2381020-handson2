package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean hasilSamaDengan = a == b;
        System.out.println("a == b :" +hasilSamaDengan);

        boolean hasilTidakSamaDengan = a != b;
        System.out.println("a != b :" +hasilTidakSamaDengan);

        boolean hasilLebihDari = a > b;
        System.out.println("a > b :" +hasilLebihDari);

        boolean hasilKurangDari = a < b;
        System.out.println("a < b :" +hasilKurangDari);

        boolean hasilLebihDariSamaDengan = a >= b;
        System.out.println("a >= b :" +hasilLebihDariSamaDengan);

        boolean hasilKurangDariSamaDengan = a <= b;
        System.out.println("a <= b :" +hasilKurangDariSamaDengan);
    }
}
