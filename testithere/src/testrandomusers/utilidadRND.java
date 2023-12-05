package testrandomusers;

import java.util.Random;

public class utilidadRND {

	public static int generar5() {
		int desde = 1,hasta = 5;
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public static int generar3() {
		int desde = 1,hasta = 3;
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public static int generar2() {
		int desde = 1,hasta = 2;
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	public static int generarALT() {
		int desde = 110,hasta = 220;
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
}
