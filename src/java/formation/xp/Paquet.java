public class Paquet {
	private List<Card> Tarot;

	public Paquet(){
		for(i=0;i<13;i++){
			for (j=0;j<4;j++){
				Tarot.add(new Card(i,j) );
			}
		}
	}
	
	
}
