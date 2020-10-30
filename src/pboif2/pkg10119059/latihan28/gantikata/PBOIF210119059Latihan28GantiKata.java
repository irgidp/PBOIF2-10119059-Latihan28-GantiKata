/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan kata yang dapat diubah
 */
package pboif2.pkg10119059.latihan28.gantikata;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan28GantiKata {

    public static void main(String[] args) {
            Scanner masukan = new Scanner(System.in);
            String kalimat,kata1,kata2,kata3;

            System.out.print("Masukkan Kalimat  : ");
            kalimat = masukan.nextLine();

            System.out.print("Ganti Kata    : ");
            kata1 = masukan.nextLine();
            System.out.print("Menjadi Kata  : ");
            kata2 = masukan.nextLine();

            kata3 = kalimat.replace(kata1, kata2);
            System.out.println("=====Hasil=====");
            System.out.println("Kalimat awal : "+kalimat);
            System.out.println("Kalimat baru : "+kata3);
        }
    
}
