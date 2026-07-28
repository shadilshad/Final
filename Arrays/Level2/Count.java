package Arrays.Level2;

public class Count {
    public static void main(String[] args) {
    int arr[] = {10,30,14,65 ,30};
    int fixed = 30, HigherCount=0, LesserCount=0;

    for(int i=0; i<arr.length; i++){
        if(fixed<arr[i]){
            HigherCount++;
        }
        else if(fixed>arr[i]){
            LesserCount++;
        }
    }
    
        System.out.println("Higher values: "+HigherCount+"\nLower Values: "+LesserCount);
    }

}