import junit.framework.TestCase;


	public class PlayerTest extends TestCase{
		public void miser_Test(){
			NewGame game= new NewGame();
			game.Joueur1.setArgent(5);
			int argentTableInitial=game.argentTable;
			game.Joueur1.miser(1, game);
			if ((game.argentTable==argentTableInitial+1)&&(game.Joueur1.getArgent()==4)){
				System.out.print("Test de miser réussi");
			}
			
		}
		public void suivre_Test(){
			NewGame game= new NewGame();
			game.Joueur1.setArgent(5);

			int argentTableInitial=game.argentTable;
			int dernierPari=2;
			game.Joueur1.suivre(dernierPari, game);
			if ((game.argentTable==argentTableInitial+2)&&(game.Joueur1.getArgent()==3)){
				System.out.print("Test de suivre réussi");
			}
		}
		public void relancer_Test(){
			NewGame game= new NewGame();
			game.Joueur1.setArgent(5);
			int argentTableInitial=game.argentTable;
			int dernierPari=2;
			int argentMisé=1;
			game.Joueur1.relancer(argentMisé, dernierPari, game);
			if ((game.argentTable==argentTableInitial+3)&&(game.Joueur1.getArgent()==2)){
				System.out.print("Test de suivre réussi");
		}
	
	}
		public void faireTapis_Test(){
			NewGame game= new NewGame();
			game.Joueur1.setArgent(5);
			int argentTableInitial=game.argentTable;
			game.Joueur1.faireTapis( game);
			if ((game.argentTable==argentTableInitial+5)&&(game.Joueur1.getArgent()==0)){
				System.out.print("Test de faireTapis réussi");
			}
			
		}
		
	
}
