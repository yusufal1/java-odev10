import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, muzik, toplamNot = 0, toplamDers = 0;
        double ortalama;


        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100) {
            toplamNot += mat;
            toplamDers++;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            toplamDers++;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            toplamDers++;
        }

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            toplamDers++;
        }

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            toplamDers++;
        }

        if(toplamDers > 0) {
            ortalama = toplamNot / toplamDers;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Hiç geçerli not yok!");
        }
    }
}