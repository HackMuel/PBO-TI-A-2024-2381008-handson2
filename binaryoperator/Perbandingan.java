package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Sama dengan
        boolean hasilSamadengan = (a == b);
        System.out.println("a == b:" + hasilSamadengan);

        // Tidak dengan sama dengan
        boolean hasilTidakSamadengan = (a != b);
        System.out.println("a != b:" + hasilTidakSamadengan);

        // Lebih besar dari
        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b:" + hasilLebihBesarDari);

        // Lebih kecil dari
        boolean hasilLebihKecilDari = (a < b);
        System.out.println("a < b:" + hasilLebihKecilDari);

        // Lebih besar atau sama dengan
        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b:" + hasilLebihBesarSamaDengan);

        //Lebih kecil atau sama denga
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b:" + hasilLebihKecilSamaDengan);
    }
}
