package greengrocerapp;
public class GreenGrocer {
    GreenGrocer(){}//constructor kurucu metot
           /*  Manav Kasa Programı Java ile kullanıcıların manavdan almış oldukları
               ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
           */
            /*   **************Algoritma*******************
            Satın alınacak ürünün cinsi ve miktarını al
            ürünün cinsini miktarı ile çarp
            çıkan sonucu ekrana yazdır.
           */

           double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00;//variables oluşturuldu ve değerleri atandı
public double araToplam(double urun, double miktar){//ara toplama işlemi için hazırlanan metot

    return urun*miktar;
}
    public double genelToplam(){//genel toplam için hazırlanan metot

        return Armut+Elma+Domates+Muz+Patlican;
    }

}
