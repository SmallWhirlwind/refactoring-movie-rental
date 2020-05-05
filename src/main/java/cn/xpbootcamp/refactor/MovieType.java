package cn.xpbootcamp.refactor;

public enum MovieType {
    NEW_RELEASE(3, 1, 3, 1),
    HISTORY(2, 2, 1.5, 1),
    CAMPUS(1.5, 3, 1.5, 1);

    private double baseCost;

    private int baseTenancy;

    private double demurrageDaily;

    private int baseRenterPoint;

    MovieType(double baseCost, int baseTenancy, double demurrageDaily, int baseRenterPoint) {
        this.baseCost = baseCost;
        this.baseTenancy = baseTenancy;
        this.demurrageDaily = demurrageDaily;
        this.baseRenterPoint = baseRenterPoint;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public int getBaseTenancy() {
        return baseTenancy;
    }

    public double getDemurrageDaily() {
        return demurrageDaily;
    }

    public int getBaseRenterPoint() {
        return baseRenterPoint;
    }

    public double calculateCost(int tenancy) {
        if (tenancy > this.getBaseTenancy()) {
            return this.getBaseCost() + (tenancy - this.getBaseTenancy()) * this.getDemurrageDaily();
        }
        return this.getBaseCost();
    }

    public int calculateRenterPoint(int tenancy) {
        if ((this == MovieType.NEW_RELEASE) && tenancy > 1) {
            return this.getBaseRenterPoint() + 1;
        }
        return this.getBaseRenterPoint();
    }
}
