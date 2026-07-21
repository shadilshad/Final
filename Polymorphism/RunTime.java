package Polymorphism;

class Sample1 {
    void set(int a){
        System.out.println("The value is ghosted!");
    }
}
class Sample2 extends Sample1{
    @Override
    void set(int a){
    System.out.println(a + " The value not is ghosted!");
    }
}
public class RunTime{
    public static void main(String[] args) {
        
        Sample2 s2 = new Sample2();
        s2.set(20);
    }
    
}

