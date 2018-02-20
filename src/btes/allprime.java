package btes;
public class allprime {
    public static void main(String[] args) {
       
       for(int i=1;i<=100;i++)
       {
           int x=1;
         for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                { x=0;
                break;
            }
            }
        
       if(x==1)
       
           System.out.println(i+" ");
        }
    }
}