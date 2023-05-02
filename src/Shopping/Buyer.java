package Shopping;

public abstract class Buyer extends User{
    public Buyer(String name, String address) {
        super(name, address);
    }
    abstract void checkOut(PaymentMethod paymentMethod);
    abstract double calculateShippingCost();


    /** This is an abstract class and inherits from User class. It has no additional variables
     *
     * Create corresponding constructor to super.
     *
     * Create abstract void checkOut method with PaymentMethod parameter
     * Create abstract double calculateShippingCost method with NO parameter
     * */
}
