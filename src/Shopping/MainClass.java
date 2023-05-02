package Shopping;

public class MainClass {
    public static void main(String[] args) {
        Seller seller1 = new PremiumSeller("John","Seattle");
        Seller seller2 = new RegularSeller("Maria","Ohio");
        Buyer buyer1 = new RegularBuyer("George","Colorado");
        Buyer buyer2 = new PremiumBuyer("Martin","Arizona");
        Product product1 = new Product("headphone",500,3);
        Product product2 = new Product("iPhone",1200,12);
        Product product3 = new Product("iPhone",49,12);
        seller1.addProduct(product1);
        seller1.addProduct(product2);
        seller2.addProduct(product3);
        System.out.println(seller1.getName());
        buyer1.addToCart(product1);
        buyer1.addToCart(product2);
        buyer1.addToCart(product2);
        buyer2.addToCart(product3);
        buyer1.checkOut(PaymentMethod.CASHonDELIVERY);
        buyer2.checkOut(PaymentMethod.CASHonDELIVERY);


        /** Create abjects of all Typs of Seller,
         * Create objects of Product and add them to product list of sellers
         * Create all types of Buyers
         * add products to their cart and call checkOut methods.
         * Check if the results are correct*/
    }
}
