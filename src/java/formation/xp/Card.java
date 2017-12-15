public class Card 
    { 
      private enum mySuit;
      private enum myValue;
      
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
     

      public Card( int suit, int value ) 
      { 
        this.myValue = myValue.values()[value]; 
        this.mySuit = mySuit.values()[suit];
      }  
    } 