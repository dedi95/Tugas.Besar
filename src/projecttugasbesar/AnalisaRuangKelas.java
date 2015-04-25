package projecttugasbesar;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class AnalisaRuangKelas {
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
    
   
    public void DataKelas() {
    
    System.out.println("Jumlah Stop Kontak : ");
    int JumlahStopKontak = input.nextInt();
    kelas.setJumlahStopKontak(JumlahStopKontak);    
    System.out.println("Kondisi Stop Kontak : ");
    String KondisiStopKontak = input.next();
    kelas.setKondisiStopKontak(KondisiStopKontak);
    System.out.println("Posisi Stop Kontak : ");
    String PosisiStopKontak = input.next();
    kelas.setPosisiStopKontak(PosisiStopKontak);
    
    if (kelas.getJumlahStopKontak() > 2 && kelas.getKondisiStopKontak()
        .equals("Bagus") && kelas.getPosisiStopKontak().equals("Belakang")) {
            return; }
    else {
    }
    
    System.out.println("Jumlah Kabel LCD : ");
    int JumlahKabelLCD = input.nextInt();
    kelas.setJumlahKabelLCD(JumlahKabelLCD);
    System.out.println("Kondisi Kabel LCD : ");
    String KondisiKabelLCD = input.next();
    kelas.setKondisiKabelLCD(KondisiKabelLCD);
    System.out.println("Posisi Kabel LCD : ");
    String PosisiKabelLCD = input.next();
    kelas.setPosisiKabelLCD(PosisiKabelLCD);
    
    if (kelas.getJumlahKabelLCD() >=2 && kelas.getKondisiKabelLCD()
        .equals("Sippp") && kelas.getPosisiKabelLCD().equals("Depan")) {
        return;   }
    else {
    }

    System.out.println("Jumlah Kipas : ");
    int JumlahKipas = input.nextInt();
    kelas.setJumlahKipas(JumlahKipas);
    System.out.println("Kondisi Kipas : ");
    String KondisiKipas = input.next();
    kelas.setKondisiKipas(KondisiKipas);
    System.out.println("Posisi Kipas : ");
    String PosisiKipas = input.next();
    kelas.setPosisiKipas(PosisiKipas);
    System.out.println("Jumlah Lampu");
    int JumlahLampu = input.nextInt();
    kelas.setJumlahLampu(JumlahLampu);
    System.out.println("Kondisi Lampu : ");
    String KondisiLampu = input.next();
    kelas.setKondisiLampu(KondisiLampu);
    System.out.println("Posisi Lampu : ");
    String PosisiLampu = input.next();
    kelas.setPosisiLampu(PosisiLampu);
        
    if(kelas.getJumlahLampu()>=5 && kelas.getKondisiLampu()
       .equals("Bagus") && kelas.getPosisiLampu().equals("Atas")) {
        return; }
    else {
    }

    if (kelas.getJumlahKipas()>=3 && kelas.getKondisiKipas()
        .equals("Bagus") && kelas.getPosisiKipas().equals("Atas")) {
        return; }
    else {
    }

    System.out.println("Jumlah AC : ");
    int JumlahAC = input.nextInt();
    kelas.setJumlahAC(JumlahAC);
    System.out.println("Kondisi AC : ");
    String KondisiAC = input.next();
    kelas.setKondisiAC(KondisiAC);
    System.out.println("Posisi AC : ");
    String PosisiAC = input.next();
    kelas.setPosisiAC(PosisiAC);
        
    }    
    public void cetakDataKelas() {
    }
    
    public void LingkunganRuangKelas() {
        System.out.println("Kondisi Lantai : ");
        String KondisiLantai = input.next();
        kelas.setKondisiLantai(KondisiLantai);
        System.out.println("Kondisi Dinding : ");
        String KondisiDinding = input.next();
        kelas.setKondisiDinding(KondisiDinding);
        System.out.println("Kondisi Atap : ");
        String KondisiAtap = input.next();
        kelas.setKondisiAtap(KondisiAtap);
        System.out.println("Kondisi Pintu : ");
        String KondisiPintu = input.next();
        kelas.setKondisiPintu(KondisiPintu);
        System.out.println("Kondisi Jendela : ");
        String KondisiJendela = input.next();
        kelas.setKondisiJendela(KondisiJendela);

    if(kelas.getKondisiLantai().equals("Bersih") && kelas.getKondisiDinding()
        .equals("Bersih") && kelas.getKondisiAtap().equals("Bersih") && kelas.getKondisiAtap()
        .equals("Bersih") && kelas.getKondisiPintu().equals("Bersih") && kelas.getKondisiJendela().equals("Bersih")) {
        return; }
    else {
    }
     
  }
    public void KebersihanRuangKelas() {
        System.out.println("Sirkulasi Udara : ");
        String SirkulasiUdara = input.next();
        kelas.setSirkulasiUdara(SirkulasiUdara);
        System.out.println("Pencahayaan : ");
        int Pencahayaan = input.nextInt();
        kelas.setPencahayaan(Pencahayaan);
        System.out.println("Kelembapan : ");
        int Kelembapan = input.nextInt();
        kelas.setKelembapan(Kelembapan);
        System.out.println("Suhu(Celcius) : ");
        int SuhuCel = input.nextInt();
        kelas.setSuhuCel(SuhuCel);
        
        System.out.println("MAAF YANG METHOD INI DAN SETERUSNYA MASIH KAMI KERJAKAN. TERIMAKASIH");
  }
    
    
    
    
}
