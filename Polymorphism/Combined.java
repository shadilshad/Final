package Polymorphism;

class sample1{
    void set(){
        System.out.println("This set is empty!");
    }
}
class Sample2 extends sample1{
   
    // method overloading
    static void value(int id, String name){
        System.out.println("The ID: " + id + " person named is "+ name);
    }
    static void value(){
        System.out.println("The person hasnt filled any information yet!");
    }}
public class Combined {

    public static void main(String[] args) {
    Sample2 s2= new Sample2();
    s2.value(); // without parameter
    s2.value(2,"Mayamad");
    }
    
}


