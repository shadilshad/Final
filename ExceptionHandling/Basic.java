package ExceptionHandling;

public class Basic {
    public static void main(String[] args) {
        
        try{
            System.out.println("123");
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("It has some errors! try figuring it out"); // aint mandatory to give this line, its optional!
        }
        
    }
    
}
