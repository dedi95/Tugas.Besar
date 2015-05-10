package projecttugasbesar;
import java.util.*;
import java.util.Scanner;

public class PeriksaKelas extends ProjectTugasBesar {
    private static Object change;
    public static void main (String[] team) {
    Scanner input = new Scanner(System.in); 
    AnalisaRuangKelas dot = new AnalisaRuangKelas();
    AnalisaRuangKelas1 set = new AnalisaRuangKelas1();
    
    dot.IdentitasRuangKelas();
    dot.KondisiRuangKelas();
    dot.KenyamananRuangKelas();
    dot.cetakNyamanKelas();
    dot.Keamananruangkelas();
    dot.cetakAmanKelas();
    set.SaranaKelas();
    set.cetakDataKelas();
    set.LingkunganRuangKelas();
    set.KebersihanRuangKelas();
    
    dot.cetakSemuaData();
    set.printSemuaData();
    

        if (change.equals("Cek")) {
        dot.cetakSemuaData();
        set.printSemuaData();
    }
        System.out.print("Hasil : ");
            String change = input.next();
   }
}