package Arrays.Level2;

public class GivenElementExist {
    public static void main(String[] args) {
        int[] values = {20,4,33,67,86,87};
        int target = 33;
        boolean found = false;

        for(int i=0; i<values.length; i++){
            if(values[i]==target){
                System.out.print(target + " is found in the index of " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element is not found");
        }
    }
    
}
