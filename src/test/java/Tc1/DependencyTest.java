package Tc1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
	void carSatrt() {
    System.out.println("car started");
    Assert.fail();
}    @Test(dependsOnMethods = {"carSatrt"})
    void driveCar() {
    	System.out.println("i am driving the car");
    }
@Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
	System.out.println("i stopped the car");
    	
    }
@Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void partCar() {
    	System.out.println("i partked the car");
    }
}
