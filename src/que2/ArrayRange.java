package que2;
import java.util.Scanner;
public class ArrayRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int n=sc.nextInt();
		int [] arr=new int[20];
		System.out.println("Enter the elements of an array ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(min>arr[i]){
				min=arr[i];
			}
		}
		int Range=max-min;
		System.out.println("the Range of  array is:" +Range);
		
		

	}

}
