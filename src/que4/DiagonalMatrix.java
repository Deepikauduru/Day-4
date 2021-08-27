package que4;
import java.util.Scanner;
public class DiagonalMatrix {

	public static void main(String[] args) {
		int flag=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
					if(a[i][j]==0){
						flag=0;
					}
					else{
						break;
					}
				}
				
			}
			
		}
		if(flag==0){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}

	}

}
