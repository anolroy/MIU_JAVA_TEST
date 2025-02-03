package practice;

static int computeDepth(int n) {

        boolean[] flags = new boolean[10];
        for (int i = 0; i < 10; i++) 
	    flags[i] = false;
        int index = 1;
        while (true) {
            int product = n * index;
            while (product > 0) {
                int rem = product % 10;
                product /= 10;

                if (!flags[rem]) {
                    flags[rem] = true;
                }
            }

            boolean finalFlag = true;
            for (boolean aFlag : flags) {
                if (!aFlag)
                    finalFlag = false;
            }

            if (finalFlag) break;
            index++;
        }

        return index;
    }


	public static void main(String[] args) {
		System.out.println(computeDepth(42));
		

	}

}
