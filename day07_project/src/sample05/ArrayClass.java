package sample05;

import java.util.Arrays;

public class ArrayClass implements ArrayInterfaceImpl {

	@Override
	public int[] arraySort(int[] a) {

		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = -a[i];
			
		}
		
		Arrays.sort(a);

		for(int i = 0; i < a.length; i++) {
			
			a[i] = -a[i];
			
		}
		
		
		return a;

	}

	@Override
	public double arrayAvg(int[] a) {

		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum / a.length;
	}

	@Override
	public int arrayMax(int[] a) {

		int arr[] = new int[a.length];

		int index = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[index] < a[i]) {
				a[index] = a[i];
				index++;
			}
			
//			Math.max(a[index], a[i]);

		}

		return a[index];
	}

}
