public class OddCountEven {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                System.err.print(numbers[i]+" ");
            }}

        for(int j=0; j<numbers.length; j++){
            if(numbers[j]%2!=0){

                System.out.print(numbers[j]+" ");
            }
        }
    }
}
