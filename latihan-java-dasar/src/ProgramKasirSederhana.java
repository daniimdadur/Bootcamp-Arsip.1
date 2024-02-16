import java.util.Date;
import java.util.Scanner;

public class ProgramKasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date tanggal = new Date();

        System.out.print("Nama Customer : ");
        String nameCostumer = input.nextLine();
        System.out.println();
        System.out.println("|=========================================|");
        System.out.println("|           PT GULAKU PAMARICAN*          |");
        System.out.println("|=========================================|");
        System.out.println("|            PILIH MENU MAKANAN           |");
        System.out.println("|=========================================|");
        System.out.println("| 1.Nasi Goreng             Rp.12.000     |");
        System.out.println("| 2.Ayam Geprek             Rp.10.000     |");
        System.out.println("| 3.Ikan Kerapu Bakar       Rp.20.000     |");
        System.out.println("| 4.Nasi Bakar              Rp.6.000      |");
        System.out.println("| 5.Cumi Bakar              Rp.17.000     |");
        System.out.println("|=========================================|");
        System.out.println();

        System.out.print("Pilih Makanan 1/2/3/4/5 : ");
        int makanan = input.nextInt();
        System.out.print("Jumlah Porsi : ");
        int porsiMakanan = input.nextInt();

        int totalMakanan = 0;
        String namaMakanan = "Tidak Tersedia";
        switch (makanan) {
            case 1 :
                totalMakanan = porsiMakanan * 12_000;
                namaMakanan = "Nasi Goreng ";
                System.out.println("Nasi Goreng " + porsiMakanan + " Porsi : Rp." + totalMakanan);
                break;
            case 2 :
                totalMakanan = porsiMakanan * 10_000;
                namaMakanan = "Ayam Geprek ";
                System.out.println("Ayam Geprek " + porsiMakanan + " Porsi : Rp." + totalMakanan);
                break;
            case 3 :
                totalMakanan = porsiMakanan * 20_000;
                namaMakanan = "Ikan Kerapu Bakar ";
                System.out.println("Ikan Kerapu Bakar " + porsiMakanan + " Porsi : Rp." + totalMakanan);
                break;
            case 4 :
                totalMakanan = porsiMakanan * 6_000;
                namaMakanan = "Nasi Bakar ";
                System.out.println("Nasi Bakar " + porsiMakanan + " Porsi : Rp." + totalMakanan);
                break;
            case 5 :
                totalMakanan = porsiMakanan * 17_000;
                namaMakanan = "Cumi Bakar ";
                System.out.println("Cumi Bakar " + porsiMakanan + " Porsi : Rp." + totalMakanan);
                break;
            default:
                System.out.println("Maaf, Pilihan Tidak Tersedia");
        }
        //program minuman
            System.out.println();
            System.out.println("|=========================================|");
            System.out.println("|           PT GULAKU PAMARICAN*          |");
            System.out.println("|=========================================|");
            System.out.println("|            PILIH MENU MINUMAN           |");
            System.out.println("|=========================================|");
            System.out.println("| 1.Es Boba                 Rp.10.000     |");
            System.out.println("| 2.Es Teh Manis            Rp.5.000      |");
            System.out.println("| 3.Kopi Tubruk             Rp.6.000      |");
            System.out.println("| 4.Es Jeruk                Rp.6.000      |");
            System.out.println("| 5.Jus Buah Naga           Rp.10.000     |");
            System.out.println("|=========================================|");
            System.out.println();

            System.out.print("Pilih Minuman 1/2/3/4/5 : ");
            int minuman = input.nextInt();
            System.out.print("Jumlah Porsi : ");
            int porsiMinuman = input.nextInt();

            int totalMinuman = 0;
            String namaMinuman = "Tidak Tersedia";
            switch (minuman) {
                case 1:
                    totalMinuman = porsiMinuman * 10_000;
                    namaMinuman = "Es Boba ";
                    System.out.println(namaMinuman + porsiMinuman + " Porsi : Rp." + totalMinuman);
                    break;
                case 2:
                    totalMinuman = porsiMinuman * 5_000;
                    namaMinuman = "Es Teh Manis ";
                    System.out.println(namaMinuman + porsiMinuman + " Porsi : Rp." + totalMinuman);
                    break;
                case 3:
                    totalMinuman = porsiMinuman * 6_000;
                    namaMinuman = "Kopi Tubruk ";
                    System.out.println(namaMinuman + porsiMinuman + " Porsi : Rp." + totalMinuman);
                    break;
                case 4:
                    totalMinuman = porsiMinuman * 6_000;
                    namaMinuman = "Es Jeruk ";
                    System.out.println(namaMinuman + porsiMinuman + " Porsi : Rp." + totalMinuman);
                    break;
                case 5:
                    totalMinuman = porsiMinuman * 10_000;
                    namaMinuman = "Jus Buah Naga ";
                    System.out.println(namaMinuman + porsiMinuman + " Porsi : Rp." + totalMinuman);
                    break;
                default:
                    System.out.println("Maaf, Pilihan Tidak Tersedia");
            }
            int jumlahSemua = totalMakanan + totalMinuman;
            System.out.println();
            System.out.println("|=========================================|");
            System.out.println("|           PT GULAKU PAMARICAN*          |");
            System.out.println("|=========================================|");
            System.out.println("              DAFTAR PEMBELIAN             ");
            System.out.println(" ----------------------------------------- ");
            System.out.println("     "+tanggal);
            System.out.println("   ~ Nama Cutomer : " + nameCostumer        );
            System.out.println("   ~ Makanan : " + namaMakanan              );
            System.out.println("     Jumlah "+porsiMakanan+" : Rp." + totalMakanan     );
            System.out.println("   ~ Minuman : " + namaMinuman              );
            System.out.println("     Jumlah "+porsiMinuman+" : Rp." + totalMinuman     );
            System.out.println(" ----------------------------------------- ");
            System.out.println("     Total Harga : " + jumlahSemua          );
            System.out.println("|-----------------------------------------|");
            System.out.println("|              Terima Kasih               |");
            System.out.println("|       Sudah Belanja Di Toko Kami ;)     |");
            System.out.println("|=========================================|");
            System.out.println();
    }
}
