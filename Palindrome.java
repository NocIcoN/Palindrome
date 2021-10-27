package MukhammadIlhamFirdaus;

import java.util.Scanner;

public class Palindrome {
    // if you put word with "ng" or "ny" that's should not be changed to "gn" or "syn"
    public static void main(String[] args) {
        String awal;
        String balik = "";
        String cek = "";
        Scanner kata = new Scanner(System.in);
        System.out.println("Masukan kata atau kalimat yang akan dibalik : ");
        awal = kata.nextLine();
        for (int i = awal.length() - 1; i >= 0; i--) {
            char c = awal.charAt(i);
            cek = String.valueOf(c);
            if (cek.equalsIgnoreCase("g")){
                char c1 = awal.charAt(i-1);
                String cek1 = String.valueOf(c1);
                if (cek1.equalsIgnoreCase("n")){
                    balik += awal.charAt(i -1);
                    i -= 1;
                }
            }
            if (cek.equalsIgnoreCase("y")){
                char c1 = awal.charAt(i-1);
                String cek1 = String.valueOf(c1);
                if (cek1.equalsIgnoreCase("n")){
                    balik += awal.charAt(i -1);
                    i -= 1;
                }
            }
            balik += c;
        }

        System.out.println("Hasil kata yang dibalik :" + balik);

        for (int i = awal.length() - 1; i >= 0; i--) {
            char c = awal.charAt(i);
            cek += String.valueOf(c);
        }
        System.out.println("MISSION COMPLEATED");
    }
}
