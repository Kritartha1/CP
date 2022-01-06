/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

{
    public static int primes(int n){
        int ans=0;
        for(int i=2;(long)i*i<=n;i++){
            if(n%i==0){
                ++ans;
                while(n%i==0){
                    n/=i;
                    
                }
            }
            
        }
        if(n!=1){
            ++ans;
        }
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            //to get unique y boundaries..the y boundaries have to be prime factors..
            
            int p=primes(M);int ans=0;
            //if we get 
            for(;p>0;p--){
                if(N%p==0){
                    ans=p;
                    break;
                }
            }
            System.out.println(ans);
        }

       
	}
}
