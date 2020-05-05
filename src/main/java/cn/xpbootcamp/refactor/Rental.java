package cn.xpbootcamp.refactor;

public class Rental {

    private Movie movie;
    private int tenancy;

    Rental(Movie movie, int tenancy) {
        this.movie = movie;
        this.tenancy = tenancy;
    }

    Movie getMovie() {
        return movie;
    }

    int getTenancy() {
        return tenancy;
    }

    public int getRenterPoint() {
        return this.getMovie().getType().calculateRenterPoint(this.getTenancy());
    }

    public double getCost() {
        return this.getMovie().getType().calculateCost(this.getTenancy());
    }
}
