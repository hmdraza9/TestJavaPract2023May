package org.javaPractTwo;

import java.util.TreeSet;

public class TestGrandChild extends TestChild{

    TestGrandChild(){

        super();
        System.out.println("I am in TestGrandChild class constructor.");

    }

     String Name = "Nooha";
     String Email = "Nooha@gmail.com";
     String phone = "8008222222";


    public void showContact(){

        System.out.println("Name: "+Name+"; Email: "+Email+"; phone: "+phone);
//        System.out.println("Name: "+super.Name+"; Email: "+super.Email+"; phone: "+super.phone);

    }
    public void showTrigger(){

        showContact();
        System.out.println("Calling parent");
        super.showContact();


    }


    public static void main(String[] args){

//        TestGrandChild t1 = new TestGrandChild();
//        t1.showTrigger();s



    }

}
