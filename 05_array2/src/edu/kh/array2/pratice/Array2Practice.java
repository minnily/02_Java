package edu.kh.array2.pratice;

public class Array2Practice {

	public void practice1(){
	
	    String[][] arr = new String[3][3];
	
	    for(int i=0; i<arr.length; i++) {
	        for(int j=0; j<arr[i].length; j++) {
	            arr[i][j] = "(" + i + ", " + j + ")";
	            
	        }
	        
	    }
	    for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	
	}
	
}
