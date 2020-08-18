import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Birinci Sayi Girin: ");
int sayi1 = reader.nextInt();
System.out.println("İkinci Sayi Girin: ");
int sayi2 = reader.nextInt();
int toplam = sayi1+sayi2;
System.out.println("Sonuç: "+toplam);
    }
}
