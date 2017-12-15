import java.util.ArrayList;
import java.util.List;

public class Paquet {
	private ArrayList<Card> Tarot = new ArrayList<Card>();

	public ArrayList<Card> getTarot() {
		return Tarot;
	}

	public void setTarot(ArrayList<Card> tarot) {
		Tarot = tarot;
	}

	public Paquet(){
		for(int i=0;i<13;i++){
			for (int j=0;j<4;j++){
				Card mCard = new Card(i,j);		
				this.Tarot.add(mCard );
			}
		}
		if (Tarot.size() != 52){
			System.out.println("Erreur dans la création du paquet");
		}
	}
	
	int getSize(){
		return Tarot.size();
		
	}
}
