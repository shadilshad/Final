package Polymorphism;

public class Compile {
    static void set(){
        System.out.println("The Set is Empty!");
    }
    static void set(int a){
        System.out.println("It has value of a: "+ a);
    }

    public static void main(String[] args) {
     
        set();
        set(10);
    }
    
}
