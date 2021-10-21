package com.revature.controlflow;

public class ControlFlow {
	public static void main(String[] args) {
		/*
		 * if statements
		 * if else
		 * switch
		 * loop: enhanced-for, for, while, do-while
		 * continue
		 * break
		 */
		
		//Array: a collection of a fixed size with elements that are orderd and accessible by an index
		//can use int arr[] = new int[5];
		//or can use int[] arr = new int[5];
		int intArr[] = new int[10]; //int arr = {-3,0.5,2,5,8,1,5,2.5,3,9}
		intArr[0] = -4;
		intArr[1] = 8;
		intArr[2] = -2;
		intArr[3] = -5;
		intArr[4] = -8;
		intArr[5] = 5;
		intArr[6] = 4;
		intArr[7] = 6;
		intArr[8] = 9;
		intArr[9] = 1;
		/*
		# ignore all .classpath file
		
		#sts-training/variables/.classpath
		#sts-training/static-vs-nonstatic/.classpath
		#sts-training/hello-world/.classpath
		#sts-training/didum-callable-utility/.classpath
		#sts-training/class-n-object/.classpath

		# ignore all .project file
		
		#sts-training/variables/.project
		#sts-training/static-vs-nonstatic/.project
		#sts-training/hello-world/.project
		#sts-training/didum-callable-utility/.project
		#sts-training/class-n-object/.project

		# ignore all .settings
		
		#sts-training/variables/.settings
		#sts-training/static-vs-nonstatic/.settings
		#sts-training/hello-world/.settings
		#sts-training/didum-callable-utility/.settings
		#sts-training/class-n-object/.settings

		# ignore all bin-folders
		
		#sts-training/static-vs-nonstatic/bin
		#sts-training/hello-world/bin
		#sts-training/didum-callable-utility/bin
		#sts-training/class-n-object/bin
		*/
		
		//enhanced-for or for-each
		for(int i: intArr) {
			System.out.println("Enhanced-for: "+i);
		}
		
		//using '==' to compare reference variables, means checking if they point to the same object.
		
		//Reverse traversal from largest to smallest index
		for(int i=intArr.length-1; i >= 0; i--) {
			System.out.println(intArr[i]);
		}
		
		//Multi-dimensional arrays (arrays within arrays)
		int[][] d2Arr = new int[][] {{1,2,3,4,5},{10,11,12,13,14,15}};
		for(int i=0; i< d2Arr.length; i++) {
			for(int j=0; j<d2Arr[i].length; j++) {
				System.out.println("i: "+i+", j: "+j+" : "+d2Arr[i][j]);
			}
		}
	}
}
