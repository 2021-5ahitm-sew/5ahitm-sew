package at.htl.Entity;

import java.time.LocalDate;

public class Customer {

    private String name;
    private LocalDate dob;

    public Customer() {
    }

    public Customer(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
