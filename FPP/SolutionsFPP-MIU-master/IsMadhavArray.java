package practice;

public class IsMadhavArray {
	static int isMadhavArray(int[] a) 
  {
        boolean correctLength = false;
        int n = 2;
        double checkLength = 1;
        while (checkLength <= a.length) {
            checkLength = n * (n + 1) / 2.0;
            if (checkLength == a.length) {
                correctLength = true;
                break;
            }
            n++;
        }
        if (!correctLength) return 0;
        int index = 1;
        for (int i = 2; index < a.length; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += a[index];
                index++;
            }
            if (sum != a[0]) return 0;
        }
        return 1;
    
}
	

	public static void main(String[] args) {
		int[] arr = {2,1,1,4,-1,-1};
		System.out.println(isMadhavArray(arr));

	}

}
