import java.util.ArrayList;
import java.util.List;

public class Player {
	private String Name;
	Hand Main;
	private int Argent;
	private int Derni�reMise;
	
	public Player(){
		this.Name = "toto";
		this.Main = new Hand();
		this.Argent = 0;
		this.Derni�reMise=0;
	}
	public Player(String name){
		this.Name = name;
		this.Main = new Hand();
		this.Argent = 0;
	}
	
	public int getDerni�reMise() {
		return Derni�reMise;
	}

	public void setDerni�reMise(int derni�reMise) {
		Derni�reMise = derni�reMise;
	}
	
	String getName(){
		return this.Name;
	}
	
	Hand getMain(){
		return this.Main;
	}
	
	int getArgent(){
		return this.Argent;
	}
	
	void setName(String name){
		this.Name = name;
	}
	
	void setMain(Hand main){
		this.Main = main;
	}
	
	void setArgent(int argent){
		this.Argent = argent;
	}
	
	void miser(int argentMis�, NewGame game){
		if (argentMis�<this.Argent) {
			this.Argent=this.Argent-argentMis�;
			game.argentTable=game.argentTable+argentMis�;
		}
	}

	void suivre(int dernierPari, NewGame game){
		if (dernierPari<this.Argent) {
			this.Argent=this.Argent-dernierPari;
			game.argentTable=game.argentTable+dernierPari;
		}
	}
	
	void relancer(int argentAjout�, int dernierPari, NewGame game){
		if (argentAjout�<this.Argent && argentAjout�>dernierPari) {
			this.Argent=this.Argent-argentAjout�;
			game.argentTable=game.argentTable+dernierPari;
		}
	}
	void faireTapis(NewGame game){
			game.argentTable=game.argentTable+this.getArgent();
			this.Argent=0;
			
		}
	void voirMiseActuelle(){
		System.out.print(this.getDerni�reMise());
	}
	void passer(NewGame game){
		System.out.println("Mise du joueur 2 :"+ game.Joueur2.getDerni�reMise());
		System.out.println("Mise du joueur 3 :"+ game.Joueur3.getDerni�reMise());
		System.out.println("Mise du joueur 4 :"+ game.Joueur4.getDerni�reMise());
	}
	
	void printMain(){
		for (int i=0; i<this.Main.getNumber(); i++){
			System.out.println(i);
			this.Main.cards.get(i).printCard();
		}
		
	}
}
