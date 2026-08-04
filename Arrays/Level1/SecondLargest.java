public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {20,30,22,36,76,44};
        int largest = arr[0], second = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]> second && arr[i]< largest){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    
}
