public class OddEven {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int Odd =0, Even=0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                Odd++;
            }
            else{
                Even++;
            }
        }
        System.out.println("Odd: "+ Odd + "\nEven: "+ Even);
    }
}
