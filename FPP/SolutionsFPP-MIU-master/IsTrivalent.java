package practice;

public class IsTrivalent {
	static int isTrivalent(int[] a)
        {
        int index = 0;
        for (int anA : a) {
            boolean flag = true;
            for (int k = 0; k < index; k++) {
                if (a[k] == anA) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
              
                index++;
            }
        }
       
        if (index != 3) return 0;
         else return 1;
    }

	public static void main(String[] args) {
		System.out.println(isTrivalent(new long[] { 1,1,1,1,2,3,3,3,3}));

	}

}
