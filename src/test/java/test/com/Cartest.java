package test.com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itexps.testpackage.mavenproject1.Car;
import com.itexps.testpackage.mavenproject1.Truck;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roma2
 */
public class Cartest {
    Car car;
    Truck truck;
    public Cartest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCar() {
         car.setMake("Honda");
         car.setModel("accord");
         assertEquals("Honda", car.getMake());
         assertEquals("accord", car.getModel());
     }
     
     @Test
     public void testTruck(){
     truck.setMake("Chevy");
     truck.setModel("Tahoe");
     truck.setPrice(25000);
         assertEquals("Chevy", truck.getMake());
         assertEquals("Tahoe", truck.getModel());
         assertEquals(25000, 25000, 1);
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        car=new Car(); 
        truck=new Truck();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
