
import java.util.*;
public class BinaySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the size f the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("ente key element to seach");

		int key=sc.nextInt();
		Arrays.sort(arr);
		int res=binarySearch(arr,key);
		System.out.println(res);
		
		//tc--o(lg n)
		//sc--o(1)
	}
	public static  int binarySearch(int[] arr,int key) {
		int r=arr.length-1;
		int l=0;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>mid) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
		
	}

}
