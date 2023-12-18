import java.util.Arrays;

public class builtBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tc--o(lg n)
		//sc--o(1)
		
		int arr[]= {10,20,30,45,67,89,1,2,3,4,5};
		Arrays.sort(arr);
		int key=89;
		int res=Arrays.binarySearch(arr, key);
		System.out.println(res);
	}

}
