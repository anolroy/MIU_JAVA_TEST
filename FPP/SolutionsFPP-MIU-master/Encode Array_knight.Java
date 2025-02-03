static int[] encodeArray(int n) {
        if (n == 0)
            return new int[]{1};

        int size = n < 0 ? 1 : 0;
        int nCopy = n < 0 ? -n : n;

        while (nCopy > 0) {
            int digit = nCopy % 10;
            nCopy /= 10;
            size += digit + 1;
        }

        int[] result = new int[size];

        nCopy = n < 0 ? -n : n;
        for (int i = 0; i < size; i++) 
	{
            if (i == 0 && n < 0) 
	   {
                result[i] = -1;
                i++;
            }

            while (nCopy > 0) 
	  {
                int digit = nCopy % 10;
                nCopy /= 10;

                for (int j = 0; j < digit; j++) {
                    result[i] = 0;
                    i++;
                }
                result[i] = 1;
                i++;
            }
        }
        return result;
    }