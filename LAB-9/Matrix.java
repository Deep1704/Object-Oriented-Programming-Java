import java.util.*;

class sumArray implements Runnable{
	static int [][] a;
	static int col,row;
	static int y=0;
	public void readArray(int n,int m,Scanner sc){

		a=new int[n][m];
		col=n;
		row=m;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	    public void run(){
	    	int sum=0;
	    	for(int i=0;i<col;i++){
	    		sum=sum+a[y][i];
	    	}
	    	y++;

    	System.out.println("Thread ID : " +Thread.currentThread().getId()+"sum :"+sum);

    	}
    }

public class Matrix{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Column For Matrix");
		int n=sc.nextInt();
		int m=sc.nextInt();
		sumArray a1=new sumArray();
		a1.readArray(n,m,sc);

		sumArray [] b1;
		b1=new sumArray[n];
		for(int i=0;i<n;i++){
			b1 [i]=new sumArray();
			Thread t1=new Thread(b1[i]);
			t1.start();
		}
	}
}    	
