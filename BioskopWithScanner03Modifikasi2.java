import java.util.Scanner;

public class BioskopWithScanner03Modifikasi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                           
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Kursi berhasil dipesan untuk " + nama);
                                break; 
                            } else {
                                System.out.println("Kursi sudah terisi! Silakan pilih kursi lain yang tersedia.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak valid! Silakan masukkan ulang.");
                        }
                    }
                    break;

                case 2:
                    
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.print(penonton[i][j] + "\t");
                            } else {
                                System.out.print("***\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
