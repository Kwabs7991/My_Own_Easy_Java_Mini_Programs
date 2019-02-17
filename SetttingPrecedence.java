class Precedence {

	public static void main( strings args[]){
	
	
	  //Here a default precedence is used here to fulfill the expression and provide a result.
    
		int summedUp = 56 - 12 + 6 * 1 ; //6 x 1 = 6, -12 + 6 = 6, 56 - 6 = 50;
		System.out.println("Default order: " + summedUp) ;		
		
    
		//Where expressions have multiple nested parentheses the innermost the precedence.
		//Here both Addition and Subtraction are given precedence over the use of multiplication which happens last.
    
		summedUp = (56 - 12 + 6) * 1 ; // 56 - 6 =  50, 50 x 1 = 50;
		System.out.println("Default order: " + summedUp) ;	
		
		
		//Here the operation precedence order is; addition first, then subtraction and lastly multiplication;
    
		summedUp = (56 - (12 + 6)) * 1 ; // 56 - 18 = 38, 38 x 1 = 38;
		System.out.println("Default order: " + summedUp) ;	
	
	}

}
