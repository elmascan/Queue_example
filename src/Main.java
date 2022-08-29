import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    //Firindan 1(dahil) ile 10(dahil) arasi pide cikacak. Kuyruktakiler pideyi almaya calisacak.

    public static void main(String[] args) {

        System.out.println("Ramazan Pidesi Uygualamasi ! ");

        Random random = new Random();

        Queue<String> pide_kuyrugu = new LinkedList<String>();

        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Ayse");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Kemal");
        pide_kuyrugu.offer("Mustafa");

        int pide_sayisi = 1 + random.nextInt(10);

        System.out.println("Pideler cikiyor...");
        System.out.println("Cikan Pide Sayisi : " + pide_sayisi);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (pide_sayisi != 0){
            System.out.println(pide_kuyrugu.poll()+ " pideyi aldi ! ");
            pide_sayisi--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Pide Kalmadi ! ");


    }
}
