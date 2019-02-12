public class Logic {
 
    public static void main( String[] args ){
        
        boolean Oui = true;
        boolean Noo = false;
        
        //To test if both conditions are two
        System.out.println("Both OuiOui True: " + (Oui && Oui));
        System.out.println("Both OuiNoo True: " + (Oui && Noo));
        
        //To test if one of the two conditions are true
        System.out.println("Both OuiNoo True: " + (Oui || Oui));
        System.out.println("Both OuiNoo True: " + (Oui || Noo));
        System.out.println("Both NooNoo True: " + (Noo || Noo));
        
        //These are used to show an original value and an inverse value
        System.out.println("Original Oui value: " + Oui);
        System.out.println("Inverse Oui Value " + !Oui );
        
    }
}
