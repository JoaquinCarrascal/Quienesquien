package testrandomusers;

public class Persona 
{

	private int iD;
	private String desde;
	private char sexo;
	private String ojo;
	private String pelo;
	private int altura;
	
	public Persona(String desde, char sexo, String ojo, String pelo, int altura) {
		this.desde = desde;
		this.sexo = sexo;
		this.ojo = ojo;
		this.pelo = pelo;
		this.altura = altura;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getOjo() {
		return ojo;
	}

	public void setOjo(String ojo) {
		this.ojo = ojo;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [iD=" + iD + ", desde=" + desde + ", sexo=" + sexo + ", ojo=" + ojo + ", pelo=" + pelo
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
}
