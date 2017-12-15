public class Card 
    { 
      private enum myValue{
    	  Deux,
    	  Trois,
    	  Quattre,
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
      
      private mySuit mysuit;
      private myValue myvalue;
     

      public Card( int suit, int value ) 
      { 
        this.myvalue = myvalue.values()[value]; 
        this.mysuit = mysuit.values()[suit];
      }  
    } 