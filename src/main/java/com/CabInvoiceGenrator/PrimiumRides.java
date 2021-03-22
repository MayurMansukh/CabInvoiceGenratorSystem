package com.CabInvoiceGenrator;

public enum PrimiumRides {
    Normal(10.0,1.0,5.0),
    PREMIUM(15.0,2.0,20.0);

    private final double costperkm;
    private final double costpermin;
    private final double minfare;

    PrimiumRides(double costperkm, double costpermin, double minfare){
        this.costperkm=costperkm;
        this.costpermin=costpermin;
        this.minfare=minfare;
    }

    public double calcCostOfCabRide(Rides ride) {
        double rideCost = ride.distance * costperkm + ride.time * costpermin;
        return rideCost;
    }
}
