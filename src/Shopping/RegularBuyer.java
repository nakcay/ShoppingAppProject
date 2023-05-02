package Shopping;

public class RegularBuyer extends Buyer {

    public RegularBuyer(String name, String address) {
        super(name, address);
    }

    @Override
    void checkOut(PaymentMethod paymentMethod) {
        if (paymentMethod.equals(PaymentMethod.CREDITCARD)) {
            System.out.println((getCart().getTotal() + calculateShippingCost()) + " has been deducted from your card");
        }
        if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
            System.out.println("The amount  you must pay on delivery is " + (getCart().getTotal() + calculateShippingCost()));
        }

        /*for (Object product:getCart().getCartProducts()) {*//*not finished, cannot reach sellProduct method*//*
//            getCart().getCartProducts();

            if (paymentMethod.equals(PaymentMethod.CREDITCARD)) {
                System.out.println((getCart().getTotal() + getShippingCost()) + " has been deducted from your card");
            }
            if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
                System.out.println("The amount  you must pay on delivery is " + (getCart().getTotal() + getShippingCost()));
            }
        }*/
    }

    @Override
    double calculateShippingCost() {
        if (getCart().getTotal() < 50) {
           return getCart().getTotal()*0.10;
        }
        return 0;
    }


    /** This class inherits from Buyer class. It has no additional variables
     * Create a corresponding constructor to super.
     *
     * implement calculateShipping method. In the method
     *                   if cart total is less than $50 return cartTotal*0.10
     *
     * Implement checkOut method. In the method
     *                   call sellProduct method for each product and
     *                   if payment method is CREDITCARD print "$cardTotal+shipping has been deducted from your card"
     *                   if payment method is CASHonDELIVERY print "The amount you must pay on delivery is $cardTotal+shipping"
     *
     * */
}
