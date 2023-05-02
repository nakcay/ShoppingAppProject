package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double total;
    private List<Product> cartProducts;

    public Cart() {
        this.total = 0;
        this.cartProducts = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double amount) {
        this.total += amount;
    }

    public List getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List cartProducts) {
        this.cartProducts = cartProducts;
    }
    /** This class has
     *              private double total variable and private list of products named cartProducts
     * Create a constructor with no parameters. In the constructor
     *              set total to 0.
     *              initialize the list
     *
     * Create all getters and setters
     *
     * In setTotal method increment balance by the value you are getting as parameter
     */

}
