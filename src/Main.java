import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double normalTutar,yasIndirimi,indirimliTutar,gidisDonusBiletIndirimi,mesafe,yas,yolculukTipi,toplamTutar;

        System.out.print("Mesafeyi km turunden giriniz : ");
        mesafe = scan.nextInt();
        System.out.print("Yasinizi giriniz : ");
        yas= scan.nextInt();
        System.out.print("Yolculuk Tipini giriniz(1>>tek yon, 2>>gidis-donus) : ");
        yolculukTipi = scan.nextInt();

        if(mesafe>0 && yas>0)
        {
            normalTutar = mesafe * 0.10;
            if(yolculukTipi==1)
            {
                if(yas<12)
                {
                    yasIndirimi=normalTutar*0.50;
                    indirimliTutar = normalTutar-yasIndirimi;
                    toplamTutar = indirimliTutar*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }else if(yas>=12 && yas<=24)
                {
                    yasIndirimi=normalTutar*0.10;
                    indirimliTutar = normalTutar-yasIndirimi;
                    toplamTutar = indirimliTutar*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
                else if (yas>24 && yas<65)
                {
                    toplamTutar = normalTutar;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
                else if(yas>65)
                {
                    yasIndirimi = normalTutar*0.30;
                    indirimliTutar = normalTutar-yasIndirimi;
                    toplamTutar = indirimliTutar*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
            }
            else if(yolculukTipi==2)
            {
                if(yas<12)
                {
                    yasIndirimi=normalTutar*0.50;
                    indirimliTutar = normalTutar-yasIndirimi;
                    gidisDonusBiletIndirimi = indirimliTutar*0.20;
                    toplamTutar = (indirimliTutar-gidisDonusBiletIndirimi)*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }else if(yas>=12 && yas<=24)
                {
                    yasIndirimi=normalTutar*0.10;
                    indirimliTutar = normalTutar-yasIndirimi;
                    gidisDonusBiletIndirimi = indirimliTutar*0.20;
                    toplamTutar = (indirimliTutar-gidisDonusBiletIndirimi)*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
                else if (yas>24 && yas<65)
                {
                    gidisDonusBiletIndirimi = normalTutar*0.20;
                    toplamTutar = (normalTutar-gidisDonusBiletIndirimi)*2;

                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
                else if(yas>=65)
                {
                    yasIndirimi = normalTutar*0.30;
                    indirimliTutar = normalTutar-yasIndirimi;
                    gidisDonusBiletIndirimi = indirimliTutar*0.20;
                    toplamTutar = (indirimliTutar-gidisDonusBiletIndirimi)*2;
                    System.out.println("Toplam tutariniz : "+toplamTutar);
                }
            }
            else
                System.out.println("Hatali secim yaptiniz.");
        }
        else
            System.out.println("Hatali veri girdiniz.");
    }
}
