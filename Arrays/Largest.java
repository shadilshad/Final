public class Largest {
    public static void main(String[] args) {
        int[] numbers ={10,20,35,23,40};
        int First =  numbers[0];
        for(int i=0; i<numbers.length; i++){
              if(numbers[i]> First){
                First = numbers[i];
              }
        }
        System.out.println(First);
    }
}
