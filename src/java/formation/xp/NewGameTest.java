import java.util.ArrayList;
import org.junit.Test;

import junit.framework.TestCase;

public class NewGameTest extends TestCase{
	public void init_hand_Test(){
		Player toto = new Player();
		ArrayList<Player> J = new ArrayList<Player>();
		J.add(toto);
		NewGame mGame = new NewGame(1, J, 0);
		Paquet mPaquet = new Paquet();
		mGame.init_hand(mPaquet, toto);
		if (toto.Main.getNumber()==2 && mPaquet.getSize()==50){
			System.out.println("Test init_hand réussi");
		}
		else {
			System.out.println("Test init_hand raté");
		}
	}
	
}
