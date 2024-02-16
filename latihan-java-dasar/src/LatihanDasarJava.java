import java.util.Scanner;

public class LatihanDasarJava {
    public static void main(String[] args) {

        //system input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Kasir : ");
        String nameKasir = input.nextLine();
        System.out.print("Masukan Nama Pembeli : ");
        String namePembeli = input.nextLine();

        System.out.print("Masukan Harga Barang Ke-1 : ");
        int barang1 = input.nextInt();
        System.out.print("Masukan Harga Barang Ke-2 : ");
        int barang2 = input.nextInt();
        System.out.print("Masukan Harga Barang Ke-3 : ");
        int barang3 = input.nextInt();
        System.out.print("Masukan Harga Barang Ke-4 : ");
        int barang4 = input.nextInt();
        System.out.print("Masukan Harga Barang Ke-5 : ");
        int barang5 = input.nextInt();
        System.out.print("Masukan Tunai Pembeli : ");
        int tunai = input.nextInt();

        //total jumlah
        int total = barang1+barang2+barang3+barang4+barang5;
        int kembalian = tunai - total;

        //kop struk
        System.out.println("============================================================");
        System.out.println("|                                                          |");
        System.out.println("|            PT GulaKU Jaya Ciparakan Pamarican            |");
        System.out.println("|                 Promo Belanja Berhadiah                  |");
        System.out.println("|             Khusus Pembelian 5 Barang Pertama            |");
        System.out.println("|         Dengan Jumlah Belanja Minimum Rp. 1000000        |");
        System.out.println("|                                                          |");
        System.out.println("============================================================");
        System.out.println();

        //tampilan struk
        System.out.println("Nama Pembeli : " + namePembeli);
        System.out.println();
        System.out.println("Harga Barang Ke-1 : " + barang1);
        System.out.println("Harga Barang Ke-2 : " + barang2);
        System.out.println("Harga Barang Ke-3 : " + barang3);
        System.out.println("Harga Barang Ke-4 : " + barang4);
        System.out.println("Harga Barang Ke-5 : " + barang5);

        System.out.println("Total Harga Pembelian Atas Nama : " + namePembeli + "Adalah Rp." + total);
        System.out.println("Tunai : Rp." + tunai);
        System.out.println("Kembalian : Rp." + kembalian);

        if (total >= 1000000){
            System.out.println();
            System.out.println("Selamat " + namePembeli + "!!!!");
            System.out.println("Anda Mendapatkan Hadiah Berupa Satu Unit Motor ZX24R");
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.println("                     Terima Kasih");
            System.out.println("            Sudah Berbelanja Di PT GulaKU ;)");
        } else {
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.println("                     Terima Kasih");
            System.out.println("            Sudah Berbelanja Di PT GulaKU ;)");
        }
        System.out.println("Nama Kasir : " + nameKasir);
        System.out.println("NB : ");
        System.out.println("Jika Ada Kekeliruan Segera Hubungi 0857422222653");
    }
}
