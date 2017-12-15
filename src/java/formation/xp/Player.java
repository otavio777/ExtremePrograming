public class Player {
	private String Name;
	private List<Card> Main;
	private int Argent;
	
	public Player(){
		this.Name = "toto";
		this.Main = new List<Card>();
		this.argent = 0;
		
	}
	
	public Player(String name){
		this.Name = name;
		this.Main = new List<Card>();
		this.argent = 0;
		
	}
	
	String private getName(){
		return this.Name;
	}
	
	List<Card> private getMain(){
		return this.Main;
	}
	
	int private getArgent(){
		return this.Argent;
	}
	
	void private setName(String name){
		this.Name = name;
	}
	
	void private setMain(List<Card> main){
		this.Main = main;
	}
	
	void private setArgent(int argent){
		this.Argent = argent;
	}
	
	
	
}
