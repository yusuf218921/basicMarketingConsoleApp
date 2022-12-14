public class listCart extends CartMenu{
    public void list(){
        int i=0;
        for (BaseProduct baseProduct:cart){
            System.out.println(i);
            System.out.println(baseProduct);
        }
    }
}
