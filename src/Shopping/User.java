package Shopping;

public class User {
private String name;
private String address;
private Cart cart;
private double shippingCost;
private UserType userType;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
        this.cart = new Cart();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public void addToCart(Product product){
       cart.getCartProducts().add(product);
       cart.setTotal(product.getPrice());
    }
    public void removeFromCard(Product product){
        cart.getCartProducts().remove(product);
        cart.setTotal(-product.getPrice());
    }
    /** This class has
 *             private String name, address;
 *             private Cart cart;
 *             private double shippingCost;
 *             private UserType userType variables
 *
 * Create getters and setters for all these variables
 * Create a constructor with name and address parameters and initialize all necessary fields.
 * Create void addToCart method with a Product product parameter.
 *              In this method add the product to cartProducts list and
 *              pass product price to cart setTotal method
 * Create void removeFromCard method with Product product parameter
 *              In this method remove product from cartProducts list and
 *              pass negative product price to cart setTotal method
* */


}
