import java.util.ArrayList;

public class Player {
	private String Name;
	private ArrayList<Card> Main;
	private int Argent;
	
	public Player(){
		this.Name = "toto";
		this.Main = new ArrayList<Card>();
		this.Argent = 0;
		
	}
	
	public Player(String name){
		this.Name = name;
		this.Main = new ArrayList<Card>();
		this.Argent = 0;
		
	}
	
	String getName(){
		return this.Name;
	}
	
	ArrayList<Card> getMain(){
		return this.Main;
	}
	
	int getArgent(){
		return this.Argent;
	}
	
	void setName(String name){
		this.Name = name;
	}
	
	void setMain(ArrayList<Card> main){
		this.Main = main;
	}
	
	void setArgent(int argent){
		this.Argent = argent;
	}
	
	
	
}
