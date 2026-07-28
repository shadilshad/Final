package Arrays.Level2;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = {20,30,20,50};
        boolean sort = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                sort = false;
                }
            }
        System.out.println(!sort ? "Not Sorted" : "Sorted");   
 }
    
}
