package random_array;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray{
	public static int[] genRandArray(int size, int lower, int upper) {
		int[] arr = new int[size];
		for ( int k = 0; k< arr.length; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(lower, upper);
		}
		return arr;
		
	}
public static void genRandArrayNew(int[] arr, int lower, int upper ) {
	for ( int k = 0 ; k< arr.length; k++) {
		arr[k] = ThreadLocalRandom.current().nextInt(lower, upper);
	}
}

public static int[] append2End(int[] arr, int num) {
	int[] appendedArr = Arrays.copyOf(arr, arr.length+1) ;
	appendedArr[appendedArr.length-1] = num;
	return appendedArr;
}
public static int[] append2Start(int[] arr, int num) {
	int[] appendedArr = new int[arr.length+1];
	for ( int k = 0; k< appendedArr.length; k++) {
		if ( k == 0) {
			appendedArr[k] = num;
		}
		else {
			appendedArr[k] = arr[k-1];
		}
	}
	return null;

}
}