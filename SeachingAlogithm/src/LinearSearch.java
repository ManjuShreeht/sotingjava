
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("enter key element to search");
		
		int key=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("element ound at the position"+ i);
				return;
			}
		}
		
		System.out.println("element not found ");

	}

}
