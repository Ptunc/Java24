package Java24;

import java.util.Scanner;

public class java24 {

    public static void main(String[] args) {

        String kullanici, sifre;
        int select, bakiye=1500, ekleme, cekme;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("kullanıcı adınızı girin: ");
        kullanici  = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        sifre = input.nextLine();


            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            do {
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch(select){
                    case 1: 
                        System.out.println("yatırmak istediğiniz tutar: ");
                        ekleme = input.nextInt();
                        bakiye += ekleme;
                        break;
                    case 2: 
                        System.out.println("çekmek istediğiniz tutar: ");
                        cekme = input.nextInt();
                        if(cekme>=bakiye) System.out.println("bakiye yetersiz");
                        else bakiye -= cekme;
                        break;
                    case 3: 
                        System.out.println("bakiye: " + bakiye);
                        break;
                }
            }
            while (select != 4);
    }
}
