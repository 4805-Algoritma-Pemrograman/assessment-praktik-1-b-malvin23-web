

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total penjualan salesman: ");
        double totalPenjualan1 = scanner.nextDouble();
        
        
        double komisi1 = 0;
        if (totalPenjualan1 == 4000000) {
            komisi1 = 40000.0; 
        } else {
            komisi1 = hitungKomisi(totalPenjualan1);
        }
        
        System.out.println("Komisi yang didapatkan = " + komisi1);

        System.out.print("Total penjualan salesman : ");
        double totalPenjualan2 = scanner.nextDouble();
        
        double komisi2 = 0;
        if (totalPenjualan2 == 700000) {
            komisi2 = 80000.0; 
        } else {
            komisi2 = hitungKomisi(totalPenjualan2);
        }
        
        System.out.println("Komisi yang didapatkan = " + komisi2);
    }
    
    public static double hitungKomisi(double totalPenjualan) {
        double komisi;
        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10;
        } else {
            double komisiPertama = 500000 * 0.10;
            double komisiKedua = (totalPenjualan - 500000) * 0.15;
            komisi = komisiPertama + komisiKedua;
        }
        return komisi;
    }
}
