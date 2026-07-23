public class CountOddEven {
    public static void main(String[] args) {
        int[] numbers= {10,33,20,45,30};
        int OddCount =0, EvenCount = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
            EvenCount++;
            }
            else{
            OddCount++;
            }
        }
        System.out.println("The Count of Odd Digits: "+ OddCount);
        System.out.println("The Count of Even Digits: "+ EvenCount);
    }
    
}
