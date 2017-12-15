import junit.framework.TestCase;


	public class PlayerTest extends TestCase{
		public void miser_Test(){
			NewGame game= new NewGame();
			game.nombreJoueurs=1;
			Paquet mPaquet = new Paquet();
			game.Start(mPaquet);
			Player j= new Player();
			j=game.Joueurs.get(0);
			j.setArgent(5);
			game.Joueurs.set(0,j);
			int argentTableInitial=game.argentTable;
			game.Joueurs.get(0).miser(1, game);
			if ((game.argentTable==argentTableInitial+1)&&(game.Joueurs.get(0).getArgent()==4)){
				System.out.print("Test de miser réussi");
			}
			else {
				System.out.print("Test de miser raté");
			}
			
		}
		public void suivre_Test(){
			NewGame game= new NewGame();
			game.nombreJoueurs=1;
			Paquet mPaquet = new Paquet();
			game.Start(mPaquet);
			Player j= new Player();
			j=game.Joueurs.get(0);
			j.setArgent(5);
			game.Joueurs.set(0,j);
			int argentTableInitial=game.argentTable;
			int dernierPari=2;
			game.Joueurs.get(0).suivre(dernierPari, game);
			if ((game.argentTable==argentTableInitial+2)&&(game.Joueurs.get(0).getArgent()==3)){
				System.out.print("Test de suivre réussi");
			}
			else {
				System.out.print("Test de suivre raté");
			}
		}
		public void relancer_Test(){
			NewGame game= new NewGame();
			game.nombreJoueurs=1;
			Paquet mPaquet = new Paquet();
			game.Start(mPaquet);
			Player j= new Player();
			j=game.Joueurs.get(0);
			j.setArgent(5);
			game.Joueurs.set(0,j);
			int argentTableInitial=game.argentTable;
			int dernierPari=2;
			int argentMisé=1;
			game.Joueurs.get(0).relancer(argentMisé, dernierPari, game);
			if ((game.argentTable==argentTableInitial+3)&&(game.Joueurs.get(0).getArgent()==2)){
				System.out.print("Test de suivre réussi");
		}
			else {
				System.out.print("Test de relancer raté");
			}
	
		}
		public void faireTapis_Test(){
			NewGame game= new NewGame();
			game.nombreJoueurs=1;
			Paquet mPaquet = new Paquet();
			game.Start(mPaquet);
			Player j= new Player();
			j=game.Joueurs.get(0);
			j.setArgent(5);
			game.Joueurs.set(0,j);			int argentTableInitial=game.argentTable;
			game.Joueurs.get(0).faireTapis( game);
			if ((game.argentTable==argentTableInitial+5)&&(game.Joueurs.get(0).getArgent()==0)){
				System.out.print("Test de faireTapis réussi");
			}
			else {
				System.out.print("Test de faireTapis raté");
			}
			
		}
		
		public void passer_Test(){
			NewGame game= new NewGame();
			game.nombreJoueurs=1;
			Paquet mPaquet = new Paquet();
			game.Start(mPaquet);
			Player j= new Player();
			j=game.Joueurs.get(0);
			j.passer(game);
			game.Joueurs.set(0,j);
			if (game.Joueurs.get(0).Actif==0) System.out.println("Tes de passer réussi");
			else {
				System.out.print("Test de faireTapis raté");
			}
		}
		
		
	
}
