package Arrays.Level2;

public class CountOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 1};
        int target = 2, Count =0;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                Count++;
                System.out.println(target+ " Element Found at the index of "+ i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("The number of elements repeated "+ Count + " times!");

        }

    }
    
}
