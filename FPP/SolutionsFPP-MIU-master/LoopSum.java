package practice;

public class LoopSum {
	static int loopSum(int[] a, int n) {
		int i = 0;
		int sum = 0;
		int count = 0;
		for(i =0; i < a.length; ) {
			sum += a[i];
			
			count ++;
			if(count == n)
				break;
			if(i == a.length-1 && count != n) {
				i = 0;
				continue;
				
			}
				
			i++;
			
		}
		return sum;
	}
	public static int loopBackSum(int[] arr, int m) {
        int sum = 0;
        int index = 0;

        for (int i = 1; i <= m; i++) {
            sum += arr[index];
            index++;
            if (index >= arr.length) {
                index = 0; // loop back to beginning of array
            }
        }

        return sum;
    }
}
	public static void main(String[] args) {
		System.out.println(loopSum(new int[] {1, 4, 5, 6}, 4));

	}

}
