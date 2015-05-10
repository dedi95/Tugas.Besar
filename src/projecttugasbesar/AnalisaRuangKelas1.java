package projecttugasbesar;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class AnalisaRuangKelas1 extends ProjectTugasBesar {
    Scanner input = new Scanner (System.in);
    ProjectTugasBesar team = new ProjectTugasBesar();
    private Object SirkulasiUdara;
    private String ViewUdara;
    private String hasiludara;
    private String ViewHasil;
    
    public void SaranaKelas() {
    
    System.out.println("Jumlah Stop Kontak : ");
    int JumlahStopKontak = input.nextInt();
    team.setJumlahStopKontak(JumlahStopKontak);    
    System.out.println("Kondisi Stop Kontak : ");
    String KondisiStopKontak = input.next();
    team.setKondisiStopKontak(KondisiStopKontak);
    System.out.println("Posisi Stop Kontak : ");
    String PosisiStopKontak = input.next();
    team.setPosisiStopKontak(PosisiStopKontak);
    
    if (team.getJumlahStopKontak() > 2 && team.getKondisiStopKontak()
        .equals("Bagus") && team.getPosisiStopKontak().equals("Belakang")) {
            return; }
    else {
    }
    
    System.out.println("Jumlah Kabel LCD : ");
    int JumlahKabelLCD = input.nextInt();
    team.setJumlahKabelLCD(JumlahKabelLCD);
    System.out.println("Kondisi Kabel LCD : ");
    String KondisiKabelLCD = input.next();
    team.setKondisiKabelLCD(KondisiKabelLCD);
    System.out.println("Posisi Kabel LCD : ");
    String PosisiKabelLCD = input.next();
    team.setPosisiKabelLCD(PosisiKabelLCD);
    
    if (team.getJumlahKabelLCD()>=1 && team.getKondisiStopKontak().equals("Baik") && team.getPosisiStopKontak().equals("Depan")) {
        return; 
    }
    else{
    }
    
    System.out.println("Jumlah Kipas : ");
    int JumlahKipas = input.nextInt();
    team.setJumlahKipas(JumlahKipas);
    System.out.println("Kondisi Kipas : ");
    String KondisiKipas = input.next();
    team.setKondisiKipas(KondisiKipas);
    System.out.println("Posisi Kipas : ");
    String PosisiKipas = input.next();
    team.setPosisiKipas(PosisiKipas);
    System.out.println("Jumlah Lampu");
    int JumlahLampu = input.nextInt();
    team.setJumlahLampu(JumlahLampu);
    System.out.println("Kondisi Lampu : ");
    String KondisiLampu = input.next();
    team.setKondisiLampu(KondisiLampu);
    System.out.println("Posisi Lampu : ");
    String PosisiLampu = input.next();
    team.setPosisiLampu(PosisiLampu);
    
    
    
    if(team.getJumlahLampu()>=5 && team.getKondisiLampu()
       .equals("Bagus") && team.getPosisiLampu().equals("Atas")) {
        return; }
    else {
    }

    if (team.getJumlahKipas()>=3 && team.getKondisiKipas()
        .equals("Bagus") && team.getPosisiKipas().equals("Atas")) {
        return; }
    else {
    }

    System.out.println("Jumlah AC : ");
    int JumlahAC = input.nextInt();
    team.setJumlahAC(JumlahAC);
    System.out.println("Kondisi AC : ");
    String KondisiAC = input.next();
    team.setKondisiAC(KondisiAC);
    System.out.println("Posisi AC : ");
    String PosisiAC = input.next();
    team.setPosisiAC(PosisiAC);
        
    }    
    public String cetakDataKelas() {
        return null;
    }
    
        void LingkunganRuangKelas() {
        System.out.println("Kondisi Lantai : ");
        String KondisiLantai = input.next();
        team.setKondisiLantai(KondisiLantai);
        System.out.println("Kondisi Dinding : ");
        String KondisiDinding = input.next();
        team.setKondisiDinding(KondisiDinding);
        System.out.println("Kondisi Atap : ");
        String KondisiAtap = input.next();
        team.setKondisiAtap(KondisiAtap);
        System.out.println("Kondisi Pintu : ");
        String KondisiPintu = input.next();
        team.setKondisiPintu(KondisiPintu);
        System.out.println("Kondisi Jendela : ");
        String KondisiJendela = input.next();
        team.setKondisiJendela(KondisiJendela);

    if(team.getKondisiLantai().equals("Bersih") && team.getKondisiDinding()
        .equals("Bersih") && team.getKondisiAtap().equals("Bersih") && team.getKondisiAtap()
        .equals("Bersih") && team.getKondisiPintu().equals("Bersih") && team.getKondisiJendela().equals("Bersih")) {
        return; }
    else {
    }
     
  }
    @SuppressWarnings("UnnecessaryReturnStatement")
    public String KebersihanRuangKelas() {
        System.out.println("Sirkulasi Udara : ");
        String SirkulasiUdara = input.next();
        team.setSirkulasiUdara(SirkulasiUdara);
        team.AnalisaUdara();
        System.out.println("Pencahayaan : ");
        int Pencahayaan = input.nextInt();
        team.setPencahayaan(Pencahayaan);
        team.AnalisaPencahayaan();
        System.out.println("Kelembapan : ");
        int Kelembapan = input.nextInt();
        team.setKelembapan(Kelembapan);
        team.AnalisaKelembapan();
        System.out.println("Suhu(Celcius) : ");
        int SuhuCel = input.nextInt();
        team.setSuhuCel(SuhuCel);
        team.AnalisaSuhu();
        return null;
          
    }

    public String printSemuaData(){
        return null;
        
    }   
}
