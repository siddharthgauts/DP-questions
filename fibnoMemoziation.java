package DP;

// recurrsion ka har wo problem jo  loop se slove hota hai wo...tabulation se bhi  slove ho  shakta hai and vice versa

public class fibnoMemoziation {
    public  static int  fib(int n, int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] !=0){
            return f[n];
        }
        f[n]= fib(n-1, f)+fib(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        int n=45;
        int f[]= new int[n+1];
        System.out.println(fib(n,f));
    }
}
