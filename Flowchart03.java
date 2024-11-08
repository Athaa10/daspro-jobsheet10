import java.util.Scanner;

public class Flowchart03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah responden: ");
        int responden = input.nextInt();
        
        System.out.print("Masukkan jumlah pertanyaan: ");
        int pertanyaan = input.nextInt();

        int[][] survey = new int[responden][pertanyaan];
      
        System.out.println("\nMasukkan hasil survei (nilai 1-5): ");
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
            }
        }

        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            double rataResponden = total / pertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataResponden);
        }

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            double rataPertanyaan = total / responden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (responden * pertanyaan);
        System.out.printf("%nRata-rata keseluruhan: %.2f%n", rataKeseluruhan);

        input.close();
    }
}
