public class MikeMomments
{
    public static void main (String args[]){
    
        String header = "\n\tMIKE'S LIFE MOMENTS:\n";
         header += "\n\tYear\t\tGood/Bad\t?/10\tMike Moment\n";
         header += "\t----\t\t--------\t----\t-----------\n";
         
         String lifeLesson = "\t2000\t\tGood\t\t7\tSurvived Y2K\n";
         lifeLesson += "\t2015\t\tBad\t\t8\tFlopped Exams, damn\n"; 
         lifeLesson += "\t2016\t\tGood\t\t10\tFirst GF, mad\n"; 
         lifeLesson += "\t2019\t\tBad\t\t10\tStubbed my Toe\n"; 
         
         System.out.print(header + lifeLesson);
       
    
    }
}
