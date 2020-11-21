
import java.util.Scanner;

        /*
        koşullu durumlar part-1 if ve else blokları 
        if(koşul){
        koşul sağlandığında gerçekleştirilmesi istenen işlemler
        }
        else{
        
        koşul sağlanmadığı taktirde gerçekleştirilmesi istenen işelemler
        }
        
        */
        
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz :");
        int a = scn.nextInt();
        if (a >=18){
             System.out.println("Dünyada birçok devlet için yetişkin birey sınıfında sayılıyorsunuz");
        }
        else{
            System.out.println("Dünyada birçok Devlet nezlinde ERGİN birey kategorisinde değilsiniz...");
        }
    }
}
