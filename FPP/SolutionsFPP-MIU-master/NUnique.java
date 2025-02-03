package practice;

public class NUnique {
	static int isNUnique(int[] a, int n) {
		int countPairs = 0;
		int sum = 0;
		for(int i= 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				sum = a[i] + a[j];
				if(sum == n) 
					countPairs ++;
				
			}
		}
		if(countPairs == 1)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(nu.isNUnique(new int[] {7,3,3,2,4}, 11));

	}

}
