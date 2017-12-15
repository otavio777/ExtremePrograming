import java.util.ArrayList;
import java.util.Scanner;

public class NewGame {
	
		 Player Joueur1;
		 Player Joueur2;
		 Player Joueur3;
		 Player Joueur4;
		 public int argentTable;
		
		public NewGame(){
			this.Joueur1 = new Player();
			this.Joueur2 = new Player("ordi1");
			this.Joueur3 = new Player("ordi2");
			this.Joueur4 = new Player("ordi3");
			argentTable=0;
		}
		public void init_hand(Paquet p, Player j){
			int indiceRand =(int)( Math.random()*p.getSize());
			 ArrayList<Card> cards=new ArrayList<Card>();
			 cards.add(p.getTarot().get(indiceRand));
			 p.getTarot().remove(indiceRand);
			 p.setTarot(p.getTarot());
			 indiceRand =(int)( Math.random()*p.getSize());
			 cards.add(p.getTarot().get(indiceRand));
			 p.getTarot().remove(indiceRand);
			 p.setTarot(p.getTarot());
			 j.setMain(2, cards);
		}
		
		void  Start(Paquet mPaquet){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Choisir un nom jouer:");
			String mName = keyboard.nextLine();
			System.out.println("Choisir une somme pour jouer:");
			int mArgent = keyboard.nextInt();
			this.Joueur1.setName(mName);
			this.Joueur1.setArgent(mArgent);
			this.Joueur2.setArgent(mArgent);
			this.Joueur3.setArgent(mArgent);
			this.Joueur4.setArgent(mArgent);
			
			init_hand(mPaquet, Joueur1);
			System.out.println("Cartes en main");
			Joueur1.printMain();
			if (this.Joueur1.getName()!=mName){
				System.out.println("Erreur dans setName");
			}
			if (this.Joueur1.getArgent()!=mArgent){
				System.out.println("Erreur dans setArgent");
			}
		}
	}

