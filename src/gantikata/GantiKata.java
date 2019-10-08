/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;

import java.util.Scanner;
/**
 *
 * @author NOC2
 */
public class GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Program Mengganti Kata ======");
        System.out.print("\nMasukkan Kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Ganti Kata : ");
        String find = sc.next();
        System.out.print("Menjadi Kata : ");
        String replace = sc.next();
        String hasil = kalimat.replace(find, replace);
        System.out.println("====== Hasil Formatting ======");
        System.out.println("Kata awal : "+kalimat);
        System.out.println("Kata baru : "+hasil);
    }
    
}
