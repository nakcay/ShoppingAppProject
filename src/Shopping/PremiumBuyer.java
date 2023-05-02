package Shopping;

public class PremiumBuyer extends Buyer {

    public PremiumBuyer(String name, String address) {
        super(name, address);
        setShippingCost(calculateShippingCost());
    }
    @Override
    void checkOut(PaymentMethod paymentMethod) {/*same comment as regularBuyer*/
        for (Object product:getCart().getCartProducts()) {/*not finished, cannot reach sellProduct method*/

            if (paymentMethod.equals(PaymentMethod.CREDITCARD)) {
                System.out.println((getCart().getTotal() + calculateShippingCost()) + " has been deducted from your card");
            }
            if (paymentMethod.equals(PaymentMethod.CASHonDELIVERY)) {
                System.out.println("The amount  you must pay on delivery is " + (getCart().getTotal() + calculateShippingCost()));
            }
        }
    }

    @Override
    double calculateShippingCost() {
        return 0;
    }


    /**This class inherits from Buyer class. It has no additional variables.
     *
     * Create corresponding constructor to super. In the constructor
     *                           set the shippingCost to the value you are getting from calculateShippingCost method
     *
     * Implement checkOut method same as RegularBuyer class
     *
     * Implement calculateShippingCost method. return 0.
     * */
}
