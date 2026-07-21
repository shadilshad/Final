package Abstraction;

abstract class Sample1{
    abstract void set();
    void get(int a){
        System.out.println("Hi");
    }
}
class Sample2 extends Sample1{
    void set(){
        System.out.println("123");
    }
    void get(){
        System.out.println("abc");
    }
}
public class Padikunn {
 public static void main(String[] args) {
    Sample2 s2 = new Sample2();
    s2.set();
    s2.get();


 }    
}
