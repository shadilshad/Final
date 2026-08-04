public class Smallest {
    public static void main(String[] args) {
        int[] small = {10,-2,30,-4,40};
        int smallest = small[0];
        for(int i=0; i<small.length; i++){
            if(small[i]<smallest){
                smallest = small[i];
            }
        }
        System.out.println("The smallest value is "+ smallest);
    }
    
}
