import java.util.Scanner;
public class ArrayRataNilai21_1 {

    public static void main(String[] args) {
        Scanner sc21= new Scanner(System.in);

        int [] nilaiMhs= new int[10];
        double total = 0;
        double rata2;
        int lulus=0;
        
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
            nilaiMhs [i] = sc21.nextInt();
        }
            for (int i = 0; i < nilaiMhs.length; i++){
                total += nilaiMhs[i];
                if (nilaiMhs [i] > 70){
                lulus++;
            }
                
            }
                rata2 = total/nilaiMhs.length;

                System.out.println("Jumlah mahasiswa yang lulus" +lulus);
                System.out.println("Rata-rata nilai : " +rata2);
    }
}