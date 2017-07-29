import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short[] arr1=new short[]{15,10,45};
		
		short[] arr2=Arrays.copyOfRange(arr1, 1, 3);
		
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}

}
