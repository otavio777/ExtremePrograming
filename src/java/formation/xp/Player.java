import java.util.ArrayList;
import java.util.List;

public class Player {
	private String Name;
	Hand Main;
	private int Argent;
	private int DernièreMise;
	
	public Player(){
		this.Name = "toto";
		this.Main = new Hand();
		this.Argent = 0;
		this.DernièreMise=0;
	}
	public Player(String name){
		this.Name = name;
		this.Main = new Hand();
		this.Argent = 0;
	}
	
	public int getDernièreMise() {
		return DernièreMise;
	}

	public void setDernièreMise(int dernièreMise) {
		DernièreMise = dernièreMise;
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
	
	void miser(int argentMisé, NewGame game){
		if (argentMisé<this.Argent) {
			this.Argent=this.Argent-argentMisé;
			game.argentTable=game.argentTable+argentMisé;
		}
	}

	void suivre(int dernierPari, NewGame game){
		if (dernierPari<this.Argent) {
			this.Argent=this.Argent-dernierPari;
			game.argentTable=game.argentTable+dernierPari;
		}
	}
	
	void relancer(int argentAjouté, int dernierPari, NewGame game){
		if (argentAjouté<this.Argent && argentAjouté>dernierPari) {
			this.Argent=this.Argent-argentAjouté;
			game.argentTable=game.argentTable+dernierPari;
		}
	}
	void faireTapis(NewGame game){
			game.argentTable=game.argentTable+this.getArgent();
			this.Argent=0;
			
		}
	void voirMiseActuelle(){
		System.out.print(this.getDernièreMise());
	}
	void passer(NewGame game){
		System.out.println("Mise du joueur 2 :"+ game.Joueur2.getDernièreMise());
		System.out.println("Mise du joueur 3 :"+ game.Joueur3.getDernièreMise());
		System.out.println("Mise du joueur 4 :"+ game.Joueur4.getDernièreMise());
	}
	
	void printMain(){
		for (int i=0; i<this.Main.getNumber(); i++){
			System.out.println(i);
			this.Main.cards.get(i).printCard();
		}
		
	}
}
