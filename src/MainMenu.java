import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    int secenek=-1;

    public void mainMenu() {
        while(secenek!=0){
            System.out.println("*********************OVAM MARKET UYGULAMASINA HOŞ GELDİNİZ*********************\n\n\n\n\n\n");
            System.out.println("1-) Hesaba giriş yap");
            System.out.println("2-) Yeni Hesap Oluştur");
            System.out.println("3-) Uygulamadan çıkış yap");
            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");
            secenek = scanner.nextInt();
        }

    }
}
