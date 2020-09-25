package at.htl.boundary;

import at.htl.Entity.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Path("person")
public class CustomerEndpoint {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Customer getPerson() {
        Customer person = new Customer("Eva", LocalDate.of(2002, 8, 7));

        return person;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Customer> findAllCustomers() {
        Map<String, Customer> customers = new HashMap();

        customers.put("Eva", new Customer("Eva", LocalDate.now()));
        customers.put("Lorenz", new Customer("Lorenz", LocalDate.now()));

        return customers;
    }

}
