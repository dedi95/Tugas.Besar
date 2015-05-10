package projecttugasbesar;
import java.util.*;
import java.util.Scanner;

public class ProjectTugasBesar {
    private String NamaRuangan;
    private String LokasiRuangan;
    private String Jurusan;
    private int Panjang;
    private int Lebar;
    private String BentukRuang;
    private int JumlahPintu;
    private int JumlahKursi;
    private int JumlahJendela;
    private int JumlahStopKontak;
    private String KondisiStopKontak;
    private String PosisiStopKontak;
    private int JumlahKabelLCD;
    private String KondisiKabelLCD;
    private String PosisiLabelLCD;
    private int JumlahLampu;
    private String KondisiLampu;
    private String PosisiLampu;
    private int JumlahKipas;
    private String KondisiKipas;
    private String PosisiKipas;
    private int JumlahAC;
    private String KondisiAC;
    private String PosisiAC;
    private String SSID;
    private int Bandwidth;
    private int JumlahCCTV;
    private String KondisiCCTV;
    private String PosisiCCTV;
    private String KondisiLantai;
    private String KondisiDinding;
    private String KondisiAtap;
    private String KondisiPintu;
    private String KondisiJendela;
    private String SirkulasiUdara;
    private int Pencahayaan;
    private int Kelembapan;
    private int SuhuCel;
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;
    private String Kekokohan;
    private String KunciPintuJendela;
    private String Bahaya;
    
    public String getNamaRuangan() {
        return NamaRuangan;
    }
 
    public void setNamaRuangan(String NamaRuangan) {
        this.NamaRuangan = NamaRuangan;
    }
    
    public String getLokasiRuangan() {
        return LokasiRuangan;
    }

    public void setLokasiRuangan(String LokasiRuangan) {
        this.LokasiRuangan = LokasiRuangan;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public double getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public double getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public String getBentukRuang() {
        return BentukRuang;
    }

    public void setBentukRuang(String BentukRuang) {
        this.BentukRuang = BentukRuang;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getJumlahStopKontak() {
        return JumlahStopKontak;
    }

    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    public String getKondisiStopKontak() {
        return KondisiStopKontak;
    }

    public void setKondisiStopKontak(String KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    public String getPosisiStopKontak() {
        return PosisiStopKontak;
    }

    public void setPosisiStopKontak(String PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    public int getJumlahKabelLCD() {
        return JumlahKabelLCD;
    }

    public void setJumlahKabelLCD(int JumlahKabelLCD) {
        this.JumlahKabelLCD = JumlahKabelLCD;
    }

    public String getKondisiKabelLCD() {
        return KondisiKabelLCD;
    }

    public void setKondisiKabelLCD(String KondisiKabelLCD) {
        this.KondisiKabelLCD = KondisiKabelLCD;
    }

    public String getPosisiLabelLCD() {
        return PosisiLabelLCD;
    }

    public void setPosisiLabelLCD(String PosisiLabelLCD) {
        this.PosisiLabelLCD = PosisiLabelLCD;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public String getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public String getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public int getJumlahKipas() {
        return JumlahKipas;
    }

    public void setJumlahKipas(int JumlahKipas) {
        this.JumlahKipas = JumlahKipas;
    }

    public String getKondisiKipas() {
        return KondisiKipas;
    }

    public void setKondisiKipas(String KondisiKipas) {
        this.KondisiKipas = KondisiKipas;
    }

    public String getPosisiKipas() {
        return PosisiKipas;
    }

    public void setPosisiKipas(String PosisiKipas) {
        this.PosisiKipas = PosisiKipas;
    }

    public int getJumlahAC() {
        return JumlahAC;
    }

    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC = JumlahAC;
    }

    public String getKondisiAC() {
        return KondisiAC;
    }

    public void setKondisiAC(String KondisiAC) {
        this.KondisiAC = KondisiAC;
    }

    public String getPosisiAC() {
        return PosisiAC;
    }

    public void setPosisiAC(String PosisiAC) {
        this.PosisiAC = PosisiAC;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getJumlahCCTV() {
        return JumlahCCTV;
    }

    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV = JumlahCCTV;
    }

    public String getKondisiCCTV() {
        return KondisiCCTV;
    }

    public void setKondisiCCTV(String KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }

    public String getPosisiCCTV() {
        return PosisiCCTV;
    }

    public void setPosisiCCTV(String PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }

    public String getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(String KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public String getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(String KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public String getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(String KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public String getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(String KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public String getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(String KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getPencahayaan() {
        return Pencahayaan;
    }

    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan = Pencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhuCel() {
        return SuhuCel;
    }

    public void setSuhuCel(int SuhuCel) {
        this.SuhuCel = SuhuCel;
    }

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }

    
    
    
    
    void setPosisiKabelLCD(String PosisiKabelLCD) {
        
    }

    void getPosisiKabelLCD() {
        
    }

    void setLuas(double d) {
        
    }

    int getLuas() {
        return 0;
        
    }

    void setRasioLuas(int i) {
        
    }

    void DataKelas() {
        
    }
    
    void AnalisaUdara() {
        
    }

    void AnalisaPencahayaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaSuhu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKelembapan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKebisingan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaBau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKebocoran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKerusakan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKeausan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKekokohan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKunciPintuJendela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AnalisaKeamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
