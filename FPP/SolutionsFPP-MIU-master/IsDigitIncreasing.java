package practice;

public class IsDigitIncreasing {
	static int isDigitIncreasing(int n) 
	{
        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int product = 0;

            while (sum < n) {
                product = (product * 10) + i;
                sum += product;               
            }

            if (sum == n)
                return 1;
        }

        return 0;
      }
	

	public static void main(String[] args) {
		System.out.println(isDigitIncreasing(7404));

	}

}
