package genealogiaSalvaje;
import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero madre;
	private Mamifero padre;

	
	public Mamifero() {
		identificador="anonimo";
	}
	
	public Mamifero(String identificador) {
		this.identificador=identificador;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		
		if(this.getPadre()==unMamifero || this.getMadre()==unMamifero) {
			return true;
		}
		if(this.getPadre()!=null && this.getPadre().tieneComoAncestroA(unMamifero)) {
			return true;
		}
		if(this.getMadre()!=null && this.getMadre().tieneComoAncestroA(unMamifero)){
			return true;
		}
		return false;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getAbueloMaterno() {
		if(this.getMadre()!=null) {
			return this.getMadre().getPadre();
		}else {
			return null;
		}
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre()!=null) {
			return this.getMadre().getMadre();
		}else {
			return null;
		}
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre()!=null) {
			return this.getPadre().getPadre();
		}else {
			return null;
		}
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre()!=null) {
			return this.getPadre().getMadre();
		}else {
			return null;
		}
	}
	
}
