package positive;

public class larg {
	public static void main(String[] args) {
		int []arr = {20,5,49,76,9};
		int max = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println(max);
			
	}

}
