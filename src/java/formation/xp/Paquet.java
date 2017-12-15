import java.util.ArrayList;

public class Paquet {
	private ArrayList<Card> Tarot;

	public Paquet(){
		for(int i=0;i<13;i++){
			for (int j=0;j<4;j++){
				Tarot.add(new Card(i,j) );
			}
		}
	}	
}
