package com.CabInvoiceGenrator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {

    CabInvoiceGenerator cabInvoiceGenerator;

    @BeforeAll
    void set(){
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
    }
}