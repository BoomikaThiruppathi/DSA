import java.util.Scanner;
public class Main
{
    public static int fibo(int n){
    if(n <= 1)
    return n;
    else
    return fibo(n-1) + fibo(n-2);
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0;i < n;i ++){
		    System.out.print(fibo(i)+ " ");
		}
	}
}
