public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {20,30,22,36,76,44};
        int smallest = arr[0], smalll = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smalll = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<smalll){
                smalll = arr[i];
            }
        }
        System.out.println(smalll);
    
    }
    
}
