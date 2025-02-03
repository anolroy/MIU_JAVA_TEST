package practice;

public class HasKSmallFactors {
	static boolean hasKSmallFactors(int k, int n) {
                if (k <0 || n <0)
                     return false;
		for(int i = 1; i < k; i ++) {
			if(n%i == 0) 
                           {
				int result = n/i;
				if(result < k && i<k)
					//break;
                                       return true ;
				if(i == k-1)
					return false;
				
                            }
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasKSmallFactors(7, 30));

	}

}
