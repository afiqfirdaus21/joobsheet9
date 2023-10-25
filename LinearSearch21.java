import java.util.Scanner;
public class LinearSearch21 {

    public static void main(String[] args) {
        Scanner sc21= new Scanner(System.in);

        int[] arrayInt = new int[8];
        int key = 0;
        int jmlElemen;
        int hasil = 0;

        System.out.println("Masukkan jumlah elemen array : ");
        jmlElemen = sc21.nextInt();

        for (int i=0; i < arrayInt.length; i++){
            System.out.println("Masukkan elemen array ke-" +(i)+":");
            arrayInt[i]=sc21.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari : ");
        key=sc21.nextInt();

        for (int i= 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
            hasil = i;
            System.out.println("Key dalam array pada posisi indeks ke-"+hasil);
            break;
            }else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}