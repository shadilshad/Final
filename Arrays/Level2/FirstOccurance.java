package Arrays.Level2;

public class FirstOccurance {
    public static void main(String[] args) {
        
    
    int arr[] = {10,30,14,65 ,30};
    int target = 30;
    boolean found = false;

    for(int i=0; i<arr.length; i++){
        if(arr[i]== target){
            System.out.println("First occurance at: "+ i);
            found = true;
            break;
        }
    }
    
    if(!found){
        System.out.println("not found");
    }
}
}