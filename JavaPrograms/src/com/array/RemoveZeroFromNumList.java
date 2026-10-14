package com.array;

public class RemoveZeroFromNumList {

	static int numList[]= {2,0,4,0,5};
	static int finalNum[];
	static int i;
	
	public static void main(String[] args) {
		
		System.out.println(numList.length);
		
		// Count non-zero elements
		for (i = 0; i < numList.length; i++) {
			if(i!=0) {
				i++;
			}		
		}
		//new array to hold non-zero elements
        finalNum = new int[i];
        
     // Fill the new array with non-zero elements
        int index = 0;
        for (int num : numList) {
            if (num != 0) {
                finalNum[index++] = num;
            }
        }
        //System.out.println("finalNum "+finalNum);
        System.out.println("Original Array: " + java.util.Arrays.toString(numList));
        System.out.println("Array after removing zeros: " + java.util.Arrays.toString(finalNum));
	} 	

}
