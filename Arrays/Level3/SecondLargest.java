package Arrays.Level3;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {30,60,50,20};
        int first= arr[0], second = arr[0], temp=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>second){
                second = first; //second 30
                first = arr[i]; // first 60
            }
        }


    
    }
    
}
