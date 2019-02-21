

/**
 * class Bitwiise .
 *
 * @author (Tabsy)
 * @version (21/02/2019)
 */
public class Bitwiise
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
        
        int fs= 69; //combined flag status of 1000101
        
        System.out.println("Flag 1 :" + (( (fs&1) > 0) ? "ON" : "off"));
        System.out.println("Flag 2 :" + (( (fs&2) > 0) ? "ON" : "off"));
        System.out.println("Flag 3 :" + (( (fs&4) > 0) ? "ON" : "off"));
        System.out.println("Flag 4 :" + (( (fs&8) > 0) ? "ON" : "off"));
        System.out.println("Flag 5 :" + (( (fs&16) > 0) ? "ON" : "off"));
        System.out.println("Flag 6 :" + (( (fs&32) > 0) ? "ON" : "off"));
        System.out.println("Flag 7 :" + (( (fs&64) > 0) ? "ON" : "off"));
        System.out.println("Flag 8 :" + (( (fs&128) > 0) ? "ON" : "off"));
        System.out.println("Flag 9 :" + (( (fs&256) > 0) ? "ON" : "off"));
        System.out.println("Flag 10:" + (( (fs&512) > 0) ? "ON" : "off"));
    }
}
