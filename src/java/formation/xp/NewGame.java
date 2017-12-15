
public class NewGame {
	private Player Joueur1;
	private Player Joueur2;
	private Player Joueur3;
	private Player Joueur4;
	
	public NewGame(){
		this.Joueur1 = new Player();
		this.Joueur2 = new Player("ordi1");
		this.Joueur3 = new Player("ordi2");
		this.Joueur4 = new Player("ordi3");
	}
	
	void private Start(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choisir un nom jouer:");
		int mName = keyboard.nextString();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choisir une somme pour jouer:");
		int mArgent = keyboard.nextInt();
		this.Joueur1.setName(mName);
		this.Joueur1.setArgent(mArgent);
		this.Joueur2.setArgent(mArgent);
		this.Joueur3.setArgent(mArgent);
		this.Joueur4.setArgent(mArgent);
	}
}
