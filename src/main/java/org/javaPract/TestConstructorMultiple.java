package org.javaPract;

public class TestConstructorMultiple {

    TestConstructorMultiple(){

        System.out.println("I am in constructor TestConstructorMultiple");

    }
    TestConstructorMultiple(String str){

        System.out.println("I am in constructor TestConstructorMultiple: "+str);

    }
    TestConstructorMultiple(String str, int i){

        System.out.println("I am in constructor TestConstructorMultiple: "+str+" "+i);

    }

    public static void main(String[] args){

//        TestConstructorMultiple nn = new TestConstructorMultiple();
//        TestConstructorMultiple nn1 = new TestConstructorMultiple("str_param");
//        TestConstructorMultiple nn2 = new TestConstructorMultiple("str_param", 45);
        System.out.println(reverseUsingStringBuilder("Testx"));

    }


    public static String reverseUsingStringBuilder(String word){

        StringBuilder str = new StringBuilder(word);
        str.append(343);
        System.out.println("str.indexOf x: "+str.indexOf("x"));
        System.out.println("str.indexOf 3: "+str.lastIndexOf("3"));
        System.out.println("str.indexOf 3: "+str.deleteCharAt(5));
        System.out.println("str size: "+str.length());
        str.trimToSize();
        System.out.println("str size: "+str.length());
        System.out.println("str.indexOf 3: "+str.indexOf("3"));

        return str.length()+", str: "+str;
    }

}
