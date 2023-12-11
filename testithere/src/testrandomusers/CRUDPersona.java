package testrandomusers;

import java.util.Arrays;

public class CRUDPersona 
{

	private Persona [] lista;

	public CRUDPersona(Persona[] lista) {
		this.lista = lista;
	}

	public Persona[] getLista() {
		return lista;
	}

	public void setLista(Persona[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CRUDPersona [lista=" + Arrays.toString(lista) + "]";
	}

	public Persona generarPersona() {
		int menuCase = 0;
		String desde=" ",ojo=" ",pelo=" ";
		char sexo = ' ';
		int altura,cinc=5,uno=1,dos=2,tres=3,mini=110,tope=220;
		
		/*desde*/menuCase = utilidadRND.generadorAleatorio(uno, cinc);
		switch (menuCase){
		case 1:
			desde = "EU";
			break;
		case 2:
			desde = "AM";
			break;
		case 3:
			desde = "AS";
			break;
		case 4:
			desde = "OC";
			break;
		case 5:
			desde = "AF";
			break;
		}
		
		/*Sexo*/menuCase = utilidadRND.generadorAleatorio(uno, dos);
		switch (menuCase){
		case 1:
			sexo = 'M';
			break;
		case 2:
			sexo = 'F';
			break;
		}
		
		/*Ojos*/menuCase = utilidadRND.generadorAleatorio(uno, tres);
		switch (menuCase){
		case 1:
			ojo = "Mar";
			break;
		case 2:
			ojo = "Azu";
			break;
		case 3:
			ojo = "Ver";
			break;
		}
		
		/*Pelo*/menuCase = utilidadRND.generadorAleatorio(uno, cinc);
		switch (menuCase){
		case 1:
			pelo = "Cal";
			break;
		case 2:
			pelo = "Rub";
			break;
		case 3:
			pelo = "Mor";
			break;
		case 4:
			pelo = "Cas";
			break;
		case 5:
			pelo = "Roj";
			break;
		}
		
		/*Altura*/altura = utilidadRND.generadorAleatorio(mini, tope);
	
		return new Persona(desde,sexo,ojo,pelo,altura);
	}

	public void rellenarLista() {
		
		for (int i = 0; i < lista.length; i++) {
			lista [i] = generarPersona();
		}
	}
	
	public void mostrarLista() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	
}
