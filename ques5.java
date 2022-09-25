public class ques5 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {

            for(int j=1;j<=4;j++)
            {
                if(i==0)
                {
                    // if i is 0 means we have to print n n^2 n^3 n^4
                    if(j==1)
                    {
                        System.out.print("n  ");
                    }
                    else{
                        System.out.print("n^"+j+" ");
                    }

                }
                else{
                    System.out.print((int)(Math.pow(i, j))+"   ");

                    // Math.pow was giving ouput in double so I typecasted it in int
                }
            }
            System.out.println();
        }
    }
    
}
