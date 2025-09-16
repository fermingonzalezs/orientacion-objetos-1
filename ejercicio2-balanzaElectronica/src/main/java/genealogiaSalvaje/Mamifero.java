package genealogiaSalvaje;
import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero madre;
	private Mamifero padre;

	
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
		return this.getMadre().getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}
	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}
	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}
	
}
