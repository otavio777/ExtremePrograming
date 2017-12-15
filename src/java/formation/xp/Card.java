public class Card 
    { 
		
		  private mySuit mysuit;
	      private myValue myvalue;
	      
      private enum myValue{
    	  Deux,
    	  Trois,
    	  Quatre,
    	  Cinq,
    	  Six,
    	  Sept,
    	  Huit,
    	  Neuf,
    	  Dix,
    	  Valet,
    	  Dame,
    	  Roi,
    	  As
      }; 
      private enum mySuit{
    	  Trefle,
    	  Pique,
    	  Carreaux,
    	  Coeur    	  
      };     

      public Card( int value, int suit ) 
      { 
        this.myvalue = myValue.values()[value]; 
        this.mysuit = mySuit.values()[suit];
      }  
      
      public void printCard(){
    	  System.out.print(this.myvalue);
    	  System.out.print(", ");
    	  System.out.println(this.mysuit);    	  
      }
      
  	
    } 
   
   