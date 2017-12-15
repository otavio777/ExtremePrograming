import java.util.ArrayList;
import java.util.Scanner;

public class NewGame {
	
		 ArrayList<Player> Joueurs;
		 int nombreJoueurs; 
		 public int argentTable;
		 public int nombreTours;
		 int indiceJoueurActuel;
		
		public NewGame(){
			this.nombreJoueurs = 0;
			this.Joueurs = new ArrayList<Player>();
			this.argentTable=0;
			this.nombreTours=0;
			this.indiceJoueurActuel=1;
			
		}
		
		public NewGame(int i, ArrayList<Player> J, int j ){
			this.nombreJoueurs = i;
			this.Joueurs = J;
			this.argentTable=j;
			this.nombreTours=0;
			this.indiceJoueurActuel=1;
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
		
		void voirArgentTable(){
			System.out.println("L'argent sur la table : "+argentTable);
		}
		
		void  Start(Paquet mPaquet){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Choisir nombre de joueurs:");
			this.nombreJoueurs= keyboard.nextInt();
			for(int i=0;i<nombreJoueurs;++i){
				keyboard = new Scanner(System.in);
				System.out.println("Choisir un nom pour jouer:");
				String mName = keyboard.nextLine();
				System.out.println("Choisir une somme pour jouer:");
				int mArgent = keyboard.nextInt();
				Player j=new Player(mName);
				j.setArgent(mArgent);
				
				init_hand(mPaquet, j);
				j.printMain();
				if (j.getName()!=mName){
					System.out.println("Erreur dans setName");
				}
				if (j.getArgent()!=mArgent){
					System.out.println("Erreur dans setArgent");
				}
				j.setRole(i+1);
				Joueurs.add(j);
			}			
		}
		
		// une premiere manière de déterminer le vainqueur (seul joueur non couché)
		Player joueurGagnant(){
			int nombreJoueursActifs=0;
			ArrayList<Player> joueursActifs=new ArrayList<Player>();
			for(int i=0;i<nombreJoueurs;++i){
				nombreJoueursActifs=nombreJoueursActifs+Joueurs.get(i).Actif;
				if(Joueurs.get(i).Actif==1) joueursActifs.add(Joueurs.get(i));
			}
			if ( nombreJoueursActifs==1) return joueursActifs.get(0);
			else return null;
			
		}
		
		// Fonction qui permet de changer le croupier à chaque tour
		void tourSuivant(Paquet mPaquet){
			int j;
			for (int i=0; i<nombreJoueurs; i++){
				j = Joueurs.get(i).getRole();
				if (j==nombreJoueurs){
					Joueurs.get(i).setRole(1);
				}
				else Joueurs.get(i).setRole(j+1);
			}
		}
	}
