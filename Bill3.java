public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        String price_string = args[3]; 
        int price = Integer.parseInt(price_string);
        double priceforeach = (double) price / 3 ;
        double finalresult = Math.ceil(priceforeach);
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + finalresult + " Shekels each");
    }
}
