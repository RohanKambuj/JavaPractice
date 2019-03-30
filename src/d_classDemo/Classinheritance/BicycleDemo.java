package d_classDemo.Classinheritance;

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import d_classDemo.BassignmentcircleCyclinder.Circle;
//import d_classDemo.Cstatic.BicycleStatic;

public class BicycleDemo {
	int z;
	public static void main(String[] args) {
        // Create two different 
        // Bicycle objects
	   int i;
	   i = 5;
	   int j = 7;
       Bicycle bike1,bike2,bike3,bike4,bike6;//object reference
       
       //  System.out.println(bike1);
		bike1 = new Bicycle(10,10,10);
		Bicycle bike5 = new Bicycle(2,4,6);
		bike1 = bike5;
		bike2 = new Bicycle(2,3,4);
        bike6 = new Bicycle(10,10,10);
        bike3 = new Bicycle();
        Bicycle bike7 = new Bicycle();
        Bicycle bike8 = new Bicycle(5,5);
  //     bike1.cadence = 20;
       bike1.setCadence(20);
       bike1.getCadence();
    //   bike1.cadence = 50;
  //   bike1.cadence = 10;
      //  bike4 = new Bicycle(10,20);
        bike1 = bike2;
     //   bike1.
      //  bike1.setData1(10);
        
   //     Bicycle.setData1(10);
        
   
        // Invoke methods on 
        // those objects
        bike1.setCadence(50);
        bike1.speedUp(20);
        bike1.setGear(2);
//        bike1.printStates();
       // bike1.gear = 4;
        bike2.setCadence(50);
        bike2.speedUp(10);
        bike2.setGear(2);
        bike2.setCadence(40);
        bike2.speedUp(10);
        bike2.setGear(3);
      //  bike1.cadence = 50;
        System.out.println(bike2.getCadence());
       // bike2.printStates();
    //    MountainBike mbike4 = new MountainBike(3,4,5,6);
	}

}

/*
 * Question: What's wrong with the following program?

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
} */

