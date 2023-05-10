package greengrocerapp;

import java.util.Scanner;

public class Runner {

   public static void main(String[] args) {
      double miktar;
      double total;
      double[] toplam={0,0,0,0,0};
        GreenGrocer greenGrocer = new GreenGrocer();//instance oluşturdum
        Scanner scan = new Scanner(System.in);//Kullanıcıdan veri alınması için Scanner class kullanıldı.
        System.out.println("******************Mehmet Duran Kaya' nın Manav Dükkanı Uygulamasına hoşgeldiniz.******");
        System.out.print("Armut kaç kilo olacak ? ");//Kullanıcı ile iletişim kuruldu
        miktar=scan.nextDouble();//Kullanıcıdan gelen double tipindeki değer miktar adında bir variable atandı
        toplam[0]= greenGrocer.araToplam(greenGrocer.Armut, miktar);/*araToplam metodu çağrıldı ve toplam dizisine
                                                                      birinci eleman olarak atandı.
                                                                    */
        System.out.println("Ara Toplam " + toplam[0] + " TL");//satın alınan her ürün miktarıyla çarpıldı ve ekrana basıldı.
        System.out.println("---------------------------------");//görünümün düzenli olması sağlandı

        System.out.print("Elma kaç kilo olacak ? ");
        miktar = scan.nextDouble();
        toplam[1]= greenGrocer.araToplam(greenGrocer.Elma, miktar);
        System.out.println("Ara toplam= " + toplam[1] + " TL");
        System.out.println("---------------------------------");

        System.out.print("Domates kaç kilo olacak ? ");
        miktar = scan.nextDouble();
        toplam[2]= greenGrocer.araToplam(greenGrocer.Domates, miktar);
        System.out.println("Ara toplam= " + toplam[2] + " TL");
        System.out.println("---------------------------------");

        System.out.print("Muz kaç kilo olacak ? ");
        miktar = scan.nextDouble();
        toplam[3]= greenGrocer.araToplam(greenGrocer.Muz, miktar);
        System.out.println("Ara toplam= " + toplam[3] + " TL");
        System.out.println("---------------------------------");

        System.out.print("Patlıcan kaç kilo olacak ? ");
        miktar = scan.nextDouble();
        toplam[4]= greenGrocer.araToplam(greenGrocer.Patlican, miktar);
        System.out.println("Ara toplam= " + toplam[4] + " TL");
        System.out.println("---------------------------------");

       total=toplam[0]+toplam[1]+toplam[2]+toplam[3]+toplam[4];
       System.out.println(" Genel Toplam: " + total + " TL");
       System.out.println("Manavımızı tercih ettiğiniz için teşekkür ederiz");
       System.out.println("Şikayetleriniz için lütfen (0326)0000000  arayınız");
       System.out.println("Hafta içi ve Hafta sonu 08:00-22:00 saatleri\narasında hizmet vermekteyiz.");

   }

}

