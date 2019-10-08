package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Memilih warna dan menampilkan warna kepribadian.
 * 
 */
public class Main {
    //Konstanta
    private static final String FOOTER = "\nDeveloped by : Agung Nurhamidan";
    //Untuk foreground
    public static final String FG_MERAH = "\033[31m";
    public static final String FG_HIJAU = "\033[32m";
    public static final String FG_KUNING = "\033[33m";
    public static final String FG_BIRU = "\033[34m";
    public static final String FG_MAGENTA = "\033[35m";
    public static final String FG_CYAN = "\033[36m";
    //Untuk background
    public static final String BG_MERAH = "\033[31;41m";
    public static final String BG_HIJAU = "\033[32;42m";
    public static final String BG_KUNING = "\033[33;43m";
    public static final String BG_BIRU = "\033[34;44m";
    public static final String BG_MAGENTA = "\033[35;45m";
    public static final String BG_CYAN = "\033[36;46m";
    //Untuk reset
    public static final String RESET = "\033[0m";
    
    //Deklarasi variabel
    public static String warnaFavorit;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputWarna();
        tampilkanKepribadian(warnaFavorit);
        
        System.out.println(FOOTER);
    }
    
    public static void inputWarna() {
        Scanner scanner = new Scanner(System.in);
        
        //Memilih warna.
        System.out.println(FG_MERAH + "YUK" + FG_HIJAU + " CEK " + FG_KUNING + "KEPRIBADIANMU" + FG_CYAN + " DARI" + FG_MAGENTA + " WARNA" + FG_BIRU + " FAVORITMU");
        System.out.println(BG_MERAH + "        MERAH           ");
        System.out.println(BG_HIJAU + "        HIJAU           ");
        System.out.println(BG_KUNING + "        KUNING          ");
        System.out.println(BG_BIRU + "        BIRU            ");
        System.out.println(BG_MAGENTA + "        UNGU            " + RESET);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        warnaFavorit = scanner.nextLine().toUpperCase();
    }
    
    public static void tampilkanKepribadian(String warna) {
        //Menentukan keluaran
        switch(warnaFavorit) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah " + FG_MERAH + warnaFavorit);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah " + FG_HIJAU + warnaFavorit);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh dan prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah " + FG_KUNING + warnaFavorit);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah " + FG_BIRU + warnaFavorit);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah " + FG_MAGENTA + warnaFavorit);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            //Jika warna yang dimasukkan tidak valid
            default:
                System.out.println("Oops.. Belum teridentifikasi.");
        }
    }
    
}
