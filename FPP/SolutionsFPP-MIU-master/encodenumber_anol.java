public static void main(String args[])
    {
        System.out.println(Arrays.toString (EncodeNumber(1200)));        
    }
        static int[] EncodeNumber(int a )
            {
                int Prime_Factor=2;
                int count=0;
                int n=a;
                ArrayList<Integer> List = new ArrayList<>();
                while(n>1)
                {
                    if (n%Prime_Factor==0)
                    {                       
                        List.add(Prime_Factor);
                        count++;
                        n=n/Prime_Factor;
                    }
                    else
                        Prime_Factor++;  
                }

                int[] encodearray=new int[count];
                for (int j=0;j<List.size();j++)
                {
                    encodearray[j]=List.get(j);
                }
                 return encodearray;
            }