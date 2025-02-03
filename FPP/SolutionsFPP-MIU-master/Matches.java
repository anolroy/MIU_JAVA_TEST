package practice;

public class Matches {
	static int matches(int[] a, int[] p) {
		int innerLimit = 0;
                int startIndex = 0;
                int EndIndex = 0;
		for(int i=0; i < p.length; i++) {
			if(p[i] < 0)
                        {
			       innerLimit = p[i] * -1;
                               EndIndex=innerLimit+startIndex;
                                for(int j = startIndex; j < EndIndex; j++) {                                    
                                            if(a[j]> 0)
                                                    return 0;
                                    }                                   
			}
			else
                        {
				innerLimit = p[i];
                                EndIndex=innerLimit+startIndex;
                                for(int j = startIndex; j < EndIndex; j++)  
                                 {
                                     if(a[j] < 0)
                                                return 0;
                                 }
                        }
                        startIndex+= innerLimit;
		}
		return 1;			
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,-5,-5,2,3,18};
		int[] p = {3,-2,2,1};
		System.out.println(matches(a, p));

	}

}
