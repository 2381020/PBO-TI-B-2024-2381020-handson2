package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        //operator assignment dasar
        int angka = 10;
        String nama = "Andrew Simbolon";

        //operator assignment aritmatika
        int x = 5;
        x += 3;
        System.out.println("nilai x setelah += 3 adalah " +x);

        int y = 5;
        y -= 3;
        System.out.println("nilai y setelah -= 3 adalah " +y);

        int z = 5;
        z *= 3;
        System.out.println("nilai z setelah *= 3 adalah " +z);

        int a = 5;
        a /= 3;
        System.out.println("nilai x setelah /= 3 adalah " +a);

        int b = 5;
        b &= 3;
        System.out.println("nilai x setelah &= 3 adalah " +b);
    }
}
