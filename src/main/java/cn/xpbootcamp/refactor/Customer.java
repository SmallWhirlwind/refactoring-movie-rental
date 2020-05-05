package cn.xpbootcamp.refactor;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();
    private Double totalCost = 0D;
    private Integer totalRenterPoints = 0;

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    private String getName() {
        return name;
    }

    String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "：\n");
        rentals.forEach(rental -> {
            this.totalCost += rental.getCost();
            this.totalRenterPoints += rental.getRenterPoint();

            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(rental.getCost()).append("\n");
        });
        result.append("Amount owed is ").append(this.totalCost).append("\n");
        result.append("You earned ").append(this.totalRenterPoints).append(" frequent renter points");
        return result.toString();
    }
}
