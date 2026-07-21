package Polymorphism;

    class sample1{
    void set(){
        System.out.println("This set is empty!");
    }
}
public class Combined {

    // method overloading
    static void value(int id, String name){
        System.out.println("The given person's name is: " + name + " and ID is "+ id);
    }
    static void value(){
        System.out.println("The person hasnt filled any information yet!");
    }

    public static void main(String[] args) {
        value(2, "Someone");
    }
    
}

}
