package com.CabInvoiceGenrator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {

    static CabInvoiceGenerator cabInvoiceGenerator;

    @BeforeAll
    static void set(){
        cabInvoiceGenerator=new CabInvoiceGenerator();
    }
    @Test
    void calculateFareTrueTest() {
        double totalFare = cabInvoiceGenerator.calculateFare(1.0, 5);
        Assertions.assertEquals(15.0, totalFare, 0.0);
    }

    @Test
    void CalculateFareFalseTest() {
        double totalFare = cabInvoiceGenerator.calculateFare(1.0, 5);
        Assertions.assertEquals(5, totalFare, 0);
    }  @Test
    public void givenDistanceAndTimeInvoiceGeneratorShouldReturnMinimumFare() {
        double totalFare = cabInvoiceGenerator.calculateFare(0.2, 2);
        Assertions.assertEquals(5, totalFare, 0.0);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        Rides[] rides = { new Rides(1.0,5),
                new Rides(0.2,2)};

        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(20, totalFare, 0.0);
    }

}