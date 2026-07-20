public class Average {
    public static void main(String[] args) {
        int[] numbers = {5,7,9,2,5};
        int sum=0, avg =0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        avg = sum/numbers.length;
        
        System.out.println(avg);
    }
}
