package it.betacom.scuderie;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Scuderia {
	
	@Id
	@SequenceGenerator(
			name = "scuderia_sequence",
			sequenceName ="scuderia_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "scuderia_sequence"
			)
	private long id;
	
	private String nomeScuderia;
	private int vittorieStagionali;
	private String nomeVettura;
	private int punti;
	
	/**
	 * 
	 */
	public Scuderia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nomeScuderia
	 * @param vittorieStagionali
	 * @param nomeVettura
	 * @param punti
	 */
	public Scuderia(String nomeScuderia, int vittorieStagionali, String nomeVettura, int punti) {
		super();
		this.nomeScuderia = nomeScuderia;
		this.vittorieStagionali = vittorieStagionali;
		this.nomeVettura = nomeVettura;
		this.punti = punti;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeScuderia() {
		return nomeScuderia;
	}
	public void setNomeScuderia(String nomeScuderia) {
		this.nomeScuderia = nomeScuderia;
	}
	public int getVittorieStagionali() {
		return vittorieStagionali;
	}
	public void setVittorieStagionali(int vittorieStagionali) {
		this.vittorieStagionali = vittorieStagionali;
	}
	public String getNomeVettura() {
		return nomeVettura;
	}
	public void setNomeVettura(String nomeVettura) {
		this.nomeVettura = nomeVettura;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	

}
