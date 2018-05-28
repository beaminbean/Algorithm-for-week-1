
public class Algorithm1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		  int []arrayTestScore = {75,95,85,55,65,70 };
      double []arrayTestWeight = {0.10,0.20,0.25,0.25,0.10,0.10};
      	
      int []arrayAssignScore = {55,65,65,60,55,50};
      double []arrayAssignWeight  ={0.05,0.10,0.15,0.25,0.25,0.20}; 
      
      //Declaring required variables
      
      double totalTestScore = 0;
      double totalAssignScore = 0;	
      double avgTestScore = 0;
	  double avgAssignScore = 0;
      double average = 0;
      
      //Compute Avg 1
      for (int i = 0; i < arrayTestScore.length; i++) 
      {
      totalTestScore = totalTestScore + arrayTestScore[i] * arrayTestWeight[i];
        
      }
      avgTestScore = totalTestScore;
      
      //Compute Avg 2
       for (int i = 0; i < arrayAssignScore.length; i++) 
      {
      totalAssignScore = (totalAssignScore + arrayAssignScore[i] * arrayAssignWeight[i]);
        
      }
      avgAssignScore = totalAssignScore;
      
      //Compute overall Avg
      average = (avgTestScore + avgAssignScore)/2;
      System.out.println("The average test score is : " + avgTestScore);
      System.out.println("The average assignment score is : " + avgAssignScore );
      System.out.println("The master average is : " + average );
      
      	
      	
     
	}
}
