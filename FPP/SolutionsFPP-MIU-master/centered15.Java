

public class Centered15 {

	
static int isCentered15(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == 15) {
                    if (i == a.length - j - 1)
                        return 1;
                }
            }
        }

        return 0;
    }
}
	public static void main(String[] args) {
		
		System.out.println(isCentered15(new int[] {1, 1, 15 -1,-1}));
	}

}
