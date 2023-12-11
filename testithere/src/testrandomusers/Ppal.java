package testrandomusers;

public class Ppal{

	public static void main(String[] args) {
		
		//System.out.println(utilidadRND.);
		
		int tam = 3;
		Persona [][] listaPers = new Persona[tam][tam];
		CRUDPersona crudPer = new CRUDPersona(listaPers);
		crudPer.rellenarLista();
		
		crudPer.mostrarLista();
		
		
	}

}
