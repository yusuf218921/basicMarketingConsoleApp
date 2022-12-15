public class CartMenu extends Main{
    public void menu(){
        System.out.println("\n\nSepetinize Hoş Geldiniz...");
        while (loop){
            CartList listTheCart = new CartList();
            System.out.println("\n1- Sepeti Listele");
            System.out.println("2- Ürün Kaldır");
            System.out.println("0- Çıkış Yap");
            System.out.print("\nYapmak İşlediğiniz İşlemin Numarasını Girin -->");
            switch (scanner.nextInt()){
                case 1:
                    listTheCart.list();
                    System.out.println("Toplam : "+listTheCart.sum());
                    break;
                case 2:
                    boolean loop2 = true;
                    listTheCart.list();
                    while(loop2){
                        System.out.print("\nSilmek istediğiniz ürünün numarasını girin -->");
                        int i = scanner.nextInt();
                        if(i<=cart.size()&&i>0){
                            listTheCart.listProduct(i-1);
                            System.out.print(" Ürünü Başarılı Bir Şekilde Silindi\n");
                            cart.remove(i-1);
                            loop2=false;
                        }
                        else if (i==0) {
                            loop2=false;
                        } else{
                            System.out.println("Yanlış Bir Ürün Numarası Girdiniz. Lütfen Tekrar Deneyin");
                            System.out.println("Çıkış Yapmak İçin İse \"0\" yazabilirsiniz.");
                        }
                    }
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
