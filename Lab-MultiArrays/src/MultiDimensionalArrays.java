
public class MultiDimensionalArrays {
	 
//	public static void main(String[] args) {  
//		   int[][][] my3dArray = new int[3][3][3];  
//		  
//		   my3dArray[0][0][0] = 1;  
//		   System.out.println(my3dArray[0][0][0]);  
//		 }
//	public static void main(String[] args) {  
//		   String[][][] my3dArray = new String['3']['3']['3'];  
//		   
//		   
//		   my3dArray[0][0][0] = "This can be assigned to a string too?";  
//		   System.out.println(my3dArray[0][0][0]);  
//		 }
	
	public static void main(String[] args) {  
		   int[][][] my3dArray = new int[3][3][3];  
		  
		   my3dArray[0][0][0] = 1;  
		   System.out.println(my3dArray[0][0][0]);  
		  
		   int[][] my2dArray =  {{1,2,0}, {4, 5, 6}, {1, 4, 5}};  
		   System.out.println(my2dArray.length);  
		  
		   System.out.println(my2dArray[1][2]);
		   
		   // changing the value of that particular item to 7 too.
		   my2dArray[1][2] = 7;
		   
		   System.out.println(my2dArray[1][2]);
		 }
}


