package projecttugasbesar;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class AnalisaRuangKelas extends ProjectTugasBesar {
    Scanner input = new Scanner(System.in);
    ProjectTugasBesar kelas = new ProjectTugasBesar();
    
    public void IdentitasRuangKelas() {
    System.out.println("Nama Ruangan : ");
    String NamaRuangan = input.next();
    kelas.setNamaRuangan(NamaRuangan);
    System.out.println("Lokasi : ");
    String LokasiRuangan = input.next();
    kelas.setLokasiRuangan(LokasiRuangan);
    System.out.println("Jurusan : ");
    String Jurusan = input.next();
    kelas.setJurusan(Jurusan);
    System.out.println("");
}
    
    public void KondisiRuangKelas() {
    System.out.print("Masukkan Panjang : ");
    int Panjang = input.nextInt();
    kelas.setPanjang(Panjang);
    System.out.print("Masukkan Lebar : ");
    int Lebar = input.nextInt();
    kelas.setLebar(Lebar);
    
    kelas.setLuas(kelas.getPanjang() * kelas.getLebar());
    
    if (Panjang == Lebar) {
    kelas.setBentukRuang("Persegi Panjang");
    }
        
    System.out.print("Jumlah Pintu : ");
    int JumlahPintu = input.nextInt();
    kelas.setJumlahPintu(JumlahPintu);
    System.out.print("Jumlah Kursi : ");
    int JumlahKursi = input.nextInt();
    kelas.setJumlahKursi(JumlahKursi);
    System.out.print("Jumlah Jendela : ");
    int JumlahJendela = input.nextInt();
    kelas.setJumlahJendela(JumlahJendela);
    
    kelas.setRasioLuas(kelas.getLuas() / kelas.getJumlahJendela());
    if(kelas.getJumlahPintu() >=2) {
    kelas.DataKelas();
    }
    else if(kelas.getJumlahPintu() >=1)
    {
    kelas.DataKelas();
    }
    System.out.println("Sesuai");
    }
    
   
    public String KenyamananRuangKelas() {
    System.out.print("Kebisingan : ");
    String Kebisingan = input.next();
    kelas.setKebisingan(Kebisingan);
    kelas.AnalisaKebisingan();
    System.out.print("Bau : ");
    String Bau = input.next();
    kelas.setBau(Bau);
    kelas.AnalisaBau();
    System.out.print("Kebocoran : ");
    String Kebocoran = input.next();
    kelas.setKebocoran(Kebocoran);
    kelas.AnalisaKebocoran();
    System.out.print("Kerusakan : ");
    String Kerusakan = input.next();
    kelas.setKerusakan(Kerusakan);
    kelas.AnalisaKerusakan();
    System.out.print("Keausan : ");
    String Keausan = input.next();
    kelas.setKeausan(Keausan);
    kelas.AnalisaKeausan();
    return null;

}
    public String cetakNyamanKelas(){
        return null;
        
    }
    
    public void Keamananruangkelas() {
    System.out.print("Kekokohan : ");
    String Kekokohan = input.next();
    kelas.setKekokohan(Kekokohan);
    kelas.AnalisaKekokohan();
    System.out.print("Kunci Pintu dan Jendela : ");
    String KunciPintuJendela = input.next();
    kelas.setKunciPintuJendela(KunciPintuJendela);
    kelas.AnalisaKunciPintuJendela();
    System.out.print("Bahaya : ");
    String Bahaya = input.next();
    kelas.setBahaya(Bahaya);
    kelas.AnalisaKeamanan();
    
}
    
    public void cetakAmanKelas() {
        
    }
    
    public void cetakSemuaData(){
        
    }
}
