import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,select;

        System.out.print("1.sayıyı giriniz:");
        n1=input.nextInt();
        System.out.print("2.sayıyı giriniz:");
        n2=input.nextInt();

        System.out.println("1)Toplama\n" + "2)Çıkarma\n" + "3)Çarpma\n" + "4)Bölme");
        System.out.print("İşlem Seçiniz:");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam:" + (n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma:" + (n1-n2));
                break;
            case 3:
                System.out.print("Çarpma:" + (n1*n2));
                break;
            case 4:
                if (n2==0) {
                    System.out.print("Bu işlemde 2.sayı 0 olamaz");
                }
                    else {
                    System.out.print("Bölme:" + (n1 / n2));
                    }
                break;

            default:
                System.out.print("Geçersiz Seçim");
        }


    }
}
