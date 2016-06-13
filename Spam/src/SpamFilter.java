import java.io.Console;
import java.util.Scanner;

public class SpamFilter {

	public static void main(String[ ] args)
    {
		
	        for (String s: args) {
	            System.out.println(s);
	        }
		Scanner in = new Scanner(System.in);
          String[ ] name1 = { "#1", "100% satisfied", "4U", "Accept credit cards", "Act Now!", 
        		  "Additional Income", "Affordable", "All natural", "All new", "Amazing", "Apply online",
        		  "Bargain", "Best price", "Billing address", "Buy direct", 
        		  "Call", "Call free", "Can't live without","Cards Accepted", "Cents on the dollor", "Check", "Claims", "Click / Click Here / Click Below","Click to remove", "Compare rates", "Congratulation", "Cost / No cost",
        		  "Dear friend", "Do it today", 
        		  "Extra income", 
        		  "For free", "Form", "Free and FREE", "Free installation", "Free leads", "Free membership", "Free offer", "Free preview", "Free website", "Full refund", 
        		  "Get it now", "Giving away", "Guarantee", 
        		  "Here", "Hidden",
        		  "Increase sales", "Increase traffic", "Information you requensted", "Insurance", "Investment / no investment", "Investment decision", 
        		  "Legal", "Lose", 
        		  "Marketing", "Marketing solution", "Message contains", "Money", "Month trial offer", 
        		  "Name brand","Never", "No gimmicks", "No Hidden Costs", "No-obligation", "Now", 
        		  "Offer", "One time / one-time","Opportunity", "Order / Order Now / Order today /Order status", "Orders shipped by priority mail",
        		  "Performance", "Phone", "Please read", "potential earnings", "Pre-approved", "Price", "Print out and fax" , "Profits", 
        		  "Real thing", "Removal instruction", "Remove", "Risk free", 
        		  "Sales", "Satisfaction guranteed", "Save $", "Save up to", "Search engines","See for yourself", "Serious cash", "Solution", "Special promotion", "Success", 
        		  "The following form", 
        		  "Unsolicited", "Unsubscribe", "Urgent", "Us dollars", 
        		  "Wife", "Wing", "Winner", "Work at home"};

          System.out.print("How many Keyword you want to check = ");
          int n = Integer.parseInt(in.nextLine());
          String[] name=new String[n] ;
          System.out.println(name.length);
          
          for(int j = 0;j<n;j++ )
     	 {
        	  
        	  name[j] = in.nextLine();
     	 }
          double	cal=1;;
          double N=100;
          int size=name.length;
        
          double probabilityofthatemailisSpam=0.05;
          double probabilityofthatemailconationsKeywordI=0;
          double theprobabilitythattheemailcontainsthekeywordI=0; 
          double probabilityofthatemailisspamWithKeywordI=0;
          int i = 0;
         
         for ( i = 0; i < name1.length; i++)
         {
        	 for(int j = 0;j<name.length;j++ )
        	 {
        		 
        	 if(name1[i].equals(name[j]))
        	 {
                	
                	probabilityofthatemailconationsKeywordI = ((i % (N/20)) +size)/(N/20 +size ) ;
                	theprobabilitythattheemailcontainsthekeywordI = ((i % (N/10)) + 1)/(N/10 +1);
                	probabilityofthatemailisspamWithKeywordI = probabilityofthatemailconationsKeywordI * probabilityofthatemailisSpam / theprobabilitythattheemailcontainsthekeywordI;
                	
                	System.out.println(name1[i]+ " is at :" +i);
                	cal = cal * probabilityofthatemailisspamWithKeywordI;
        	  }
        	 }
         }
         System.out.println("Given email containing all keywords and probability of that email is spam is = "+cal);
               
    }
	}


