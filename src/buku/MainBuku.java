package buku;
import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa : ");
        String namaMahasiswaMain = input.nextLine();
        System.out.print("Masukkan jumlah lembaran buku : ");
        int jumlahLembaranBukuMain = input.nextInt();
        System.out.print("Masukkan jumlah kata yang dihasilkan per harinya : ");
        int jumlahKataMain = input.nextInt();
        System.out.print("Masukkan jumlah halaman yang dihasilkan per harinya : ");
        double jumlahHalamanMain = input.nextDouble();
        
        Buku dataBuku = new Buku();
        dataBuku.setNamaMahasiswa(namaMahasiswaMain);
        dataBuku.setJumlahLembaranBuku(jumlahLembaranBukuMain);
        dataBuku.setJumlahKata(jumlahKataMain);
        dataBuku.setJumlahHalaman(jumlahHalamanMain);
        dataBuku.setHari();
        dataBuku.DisplayMessage();
    }   
}
