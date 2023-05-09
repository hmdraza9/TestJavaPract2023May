package org.javaPractTwo;

public class TestChild  extends TestParent{

    TestChild(){

        super();

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
        super.showContact();

    }


    public static void main(String[] args){

        TestChild t1 = new TestChild();
        t1.showTrigger();


    }

}
