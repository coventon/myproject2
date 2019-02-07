package test.com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itexps.testpackage.mavenproject1.Car;
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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        car=new Car();    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
