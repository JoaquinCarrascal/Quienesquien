package testrandomusers;

import java.util.Random;

public class utilidadRND {

	public static int generadorAleatorio(int desde ,int hasta) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
}
