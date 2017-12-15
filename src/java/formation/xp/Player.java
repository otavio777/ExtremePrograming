import java.util.ArrayList;
import java.util.List;

public class Player {
	private String Name;
	Hand Main;
	private int Argent;
	private int Derni�reMise;
	private int Role; // croupier = 1, puis les autres joueurs.
	int Actif;
	
	public Player(){
		this.Name = "toto";
		this.Main = new Hand();
		this.Argent = 0;
		this.Derni�reMise=0;
		this.Role = 0;
		this.Actif=1;
	}
	public Player(String name){
		this.Name = name;
		this.Main = new Hand();
		this.Argent = 0;
		this.Derni�reMise = 0;
		this.Role = 0;
		this.Actif=1;
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
	
	int getRole(){
		return this.Role;
	}
	
	void setName(String name){
		this.Name = name;
	}
	
	void setMain(int num, ArrayList<Card> main){
		this.Main = new Hand(num, main);
	}
	
	void setArgent(int argent){
		this.Argent = argent;
	}
	
	void setRole(int role){
		this.Role = role;
	}
	
	void miser(int argentMis�, NewGame game){
		if (argentMis�<this.Argent) {
			this.Argent=this.Argent-argentMis�;
			game.argentTable=game.argentTable+argentMis�;
			if (game.indiceJoueurActuel<game.nombreJoueurs-1){
				game.indiceJoueurActuel=game.indiceJoueurActuel+1;
			}
			else game.indiceJoueurActuel=0;
			}
		
	}

	void suivre(int dernierPari, NewGame game){
		if (dernierPari<this.Argent) {
			this.Argent=this.Argent-dernierPari;
			game.argentTable=game.argentTable+dernierPari;
			if (game.indiceJoueurActuel<game.nombreJoueurs-1){
				game.indiceJoueurActuel=game.indiceJoueurActuel+1;
			}
			else game.indiceJoueurActuel=0;
		}
		
		
	}
	
	void relancer(int argentAjout�, int dernierPari, NewGame game){
		if (argentAjout�<this.Argent && argentAjout�>dernierPari) {
			this.Argent=this.Argent-argentAjout�;
			game.argentTable=game.argentTable+dernierPari;
			if (game.indiceJoueurActuel<game.nombreJoueurs-1){
				game.indiceJoueurActuel=game.indiceJoueurActuel+1;
			}
			else game.indiceJoueurActuel=0;
		}
		
		
	}
	void faireTapis(NewGame game){
			game.argentTable=game.argentTable+this.getArgent();
			this.Argent=0;
			if (game.indiceJoueurActuel<game.nombreJoueurs-1){
				game.indiceJoueurActuel=game.indiceJoueurActuel+1;
			}
			else game.indiceJoueurActuel=0;
			
		}
			
		
	void voirMiseActuelle(){
		System.out.print(this.getDerni�reMise());
	}
	void passer(NewGame game){
		for(int i=0;i<game.nombreJoueurs;i++){
			System.out.println("Mise du joueur"+i +" :"+ game.Joueurs.get(i).getDerni�reMise());
		}
		if (game.indiceJoueurActuel<game.nombreJoueurs-1){
			game.indiceJoueurActuel=game.indiceJoueurActuel+1;
		}
		else game.indiceJoueurActuel=0;
	}
	
	
	void printMain(){
		for (int i=0; i<this.Main.getNumber(); i++){
			this.Main.cards.get(i).printCard();
		}
	
	}
	void voirArgent(){
		System.out.println("Argent restant : "+this.getArgent());
	}
}