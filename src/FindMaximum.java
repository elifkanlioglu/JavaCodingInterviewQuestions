public class FindMaximum {

    public static void main(String[] args) {
        System.out.println( maxnum(new int[]{99, 12, 23, 32, 1043, 44, 57, 6}));
    }

    public static int maxnum(int[] ar1){
        int max = ar1[0];
        for( int each : ar1){
            if (each >= max){
                max = each;
            }

        }
        return max;
    }




}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */