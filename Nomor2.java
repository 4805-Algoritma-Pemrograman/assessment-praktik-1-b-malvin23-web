


import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahTransaksi = 0;
        double totalPendapatan = 0;
        String lagi = "";  

        do {
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();

            System.out.print("lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();
            
            scanner.nextLine();  

            double tarifPerMalam = 0;
            double persentasePelayanan = 0;

            switch (kodeBungalow) {
                case 1:
                    tarifPerMalam = 50000;
                    persentasePelayanan = 0.30;
                    break;
                case 2:
                    tarifPerMalam = 40000;
                    persentasePelayanan = 0.20;
                    break;
                case 3:
                    tarifPerMalam = 30000;
                    persentasePelayanan = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid!");
                    continue; 
            }

            double biayaMenginap = lamaMenginap * tarifPerMalam;

            double biayaPelayanan = biayaMenginap * persentasePelayanan;

            double totalBiaya = biayaMenginap + biayaPelayanan;

            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            lagi = scanner.next(); 

        } while (lagi.equalsIgnoreCase("Y"));

        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = Rp " + totalPendapatan);
        
        scanner.close();
    }
}
