package buku;
class Buku {
    private String namaMahasiswa;
    private int jumlahLembaranBuku;
    private int jumlahKata;
    private double jumlahHalaman;
    private double hari;
    
    Buku(){
        
    }
    
    public void setNamaMahasiswa(String namaMahasiswa_){
        namaMahasiswa = namaMahasiswa_;
    }
    
    public void setJumlahLembaranBuku(int jumlahLembaranBuku_){
        jumlahLembaranBuku = jumlahLembaranBuku_;
    }
    
    public void setJumlahKata(int jumlahKata_){
        jumlahKata = jumlahKata_;
    }
    
    public void setJumlahHalaman(double jumlahHalaman_){
        jumlahHalaman = jumlahHalaman_;
    }
    
    public void setHari(){
        hari = (2 / jumlahHalaman) * jumlahLembaranBuku;
    }
    
    public void DisplayMessage(){
        System.out.println("");
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Jumlah Lembaran Buku : " + jumlahLembaranBuku + " lembar");
        System.out.println("Jumlah kata yang dihasilkan per harinya : " + jumlahKata + " kata");
        System.out.println("Jumlah halaman yang dihasilkan per harinya : " + jumlahHalaman + " halaman");
        System.out.println("Maka hari yang dibutuhkan untuk menyelesaikan buku adalah : " + hari + " hari");
    }
}
