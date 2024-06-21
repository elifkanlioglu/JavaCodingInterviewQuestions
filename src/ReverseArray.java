import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

		for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
			reverse[j]= array[i];
		}

		System.out.println(Arrays.toString(reverse));

		System.out.println("------------------------------------------");


		System.out.println("------------------------------------------");

		int[] nums = {100, 200, 300, 400, 500};
		nums = reverse2(nums);

		System.out.println(Arrays.toString(nums));


		System.out.println("------------------------------------------");

		double[] a1 = {1.5, 2.5, 3.5, 4.5};

		a1 = reverse2(a1);

		System.out.println(Arrays.toString(a1));
	}
	public static int[] reverse2(int[] array1){
		int[] reverse = new int[array1.length];
		for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = array1[i];
		}
		return reverse;

	}

	public static double[] reverse2(double[] array2){
		double[] reverse = new double[array2.length];
		for (int i = array2.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = array2[i];
		}
		return reverse;

	}

}

