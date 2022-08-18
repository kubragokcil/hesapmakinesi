import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
    Double   s1,s2,islem,sonuc;
    Scanner giris= new Scanner(System.in);
    System.out.print("Birinci sayıyı giriniz:");
    s1=giris.nextDouble();
    System.out.print("İkinci sayıyı giriniz:");
    s2= giris.nextDouble();
    System.out.print("Toplama için 1, Çıkartma için 2, Çarpma için 3, bölme için 4'e basınız:");
    islem=giris.nextDouble();
       if (islem==1){
           System.out.print("Sonuç" + (s1+s2));
       }else if (islem==2) {
           System.out.print("Sonuç" + (s1-s2));
       }else if (islem==3) {
           System.out.print("Sonuç" + (s1*s2));
       }else if (islem==4){
           System.out.print("Sonuç" + (s1/s2));
       }


    }
}
