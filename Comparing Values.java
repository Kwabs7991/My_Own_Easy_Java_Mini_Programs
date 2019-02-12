public class comparsingNo {

    public static void main(String[] args) {

        String texxt = "Blazing ";
        String speach = "Java programming !";

        boolean Trslt = ( texxt == speach );  //Assigns test result, Trslt =  Test result
        System.out.println("String equality Test: " + Trslt );

        Trslt = (texxt == texxt);
        System.out.println("String equality Test: " + Trslt );

        Trslt = ( texxt != speach );   //Assign Result
        System.out.println("String Inequality Test: " + Trslt );

        Trslt = ( texxt != texxt );   //Assign Result
        System.out.println("String Inequality Test: " + Trslt );

        int doublesDozen = 24;
        int score =  35;
        int scoreTwo = 22;
        int scoreThree = 300;
        
        Trslt = (scoreTwo <= score );    //Assign Result
        System.out.println("String equality Test: " + Trslt );
        
        Trslt = (doublesDozen > scoreTwo); // Assign result
        System.out.println("String equality Test: " + Trslt );

        Trslt = (doublesDozen < score );    //Assign Result
        System.out.println("String equality Test: " + Trslt );
        
         Trslt = (scoreThree >= score );    //Assign Result
        System.out.println("String equality Test: " + Trslt );
       
    }
}
