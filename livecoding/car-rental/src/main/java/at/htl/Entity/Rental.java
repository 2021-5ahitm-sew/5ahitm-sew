package at.htl.Entity;

public class Rental {

    private Customer customer;
    private double discount;

    public Rental(Customer customer, double discount) {
        this.customer = customer;
        this.discount = discount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
