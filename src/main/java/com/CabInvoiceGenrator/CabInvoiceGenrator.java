package com.CabInvoiceGenrator;

class CabInvoiceGenerator {

        private final int COST_PER_KM = 10;
        private final int COST_PER_MINUTE = 1;
        private final double MINIMUM_FARE = 5.0;
        public RideRepossitory rideRepository=new RideRepossitory();


    public double calculateFare(double distance, int time) {
            double totalFare;
            totalFare = distance * COST_PER_KM + time * COST_PER_MINUTE;
            if (totalFare < MINIMUM_FARE)
                totalFare = MINIMUM_FARE;

            return totalFare;
        }

        public double calculateFare(Rides[] rides) {
            double totalFare = 0.0;
            for (Rides ride : rides)
                totalFare = totalFare + this.calculateFare(ride.distance, ride.time);

            return totalFare;
        }
        public int numberOfRides(Rides[] rides) {
            return rides.length;
        }

        public double calculateAverageFarePerRide(Rides[] rides) {
            CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
            double totalFare = cabInvoiceGenerator.calculateFare(rides);
            double numberOfRides = rides.length;
            double averageFare = totalFare/numberOfRides;
            return averageFare;
        }

    public double getRidesDetails(String userID) {
        return this.calculateFare(rideRepository.getRides(userID));
    }

    public void addRides(String userID, Rides[] rides) {
        rideRepository.addRides(userID, rides);
    }
    }

