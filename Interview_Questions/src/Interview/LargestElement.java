package Interview;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class LargestElement {

	public static void main(String [] args){ 
		
	int arr[] = new int []{1,2,3,4,5,6,10,20};
	int largest = Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if (largest<arr[i])
				largest = arr[i];
		
		
	}
	System.out.println(largest);
	}
}
