package it.betacom.piloti;

import it.betacom.scuderie.Scuderia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Pilota {

	@Id
	private long id;
	@SequenceGenerator(
			name = "pilota_sequence",
			sequenceName ="pilota_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "pilota_sequence"
			)

	private String nome;
	private String cognome;
	private int punti;
	private int vittorieStagionali;
	private int eta;
	private String nazionalita;
	private int numeroVettura;
	private Scuderia scuderia;
	
	
	/**
	 * 
	 */
	public Pilota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nome
	 * @param cognome
	 * @param punti
	 * @param vittorieStagionali
	 * @param eta
	 * @param nazionalita
	 * @param numeroVettura
	 * @param scuderia
	 */
	public Pilota(String nome, String cognome, int punti, int vittorieStagionali, int eta, String nazionalita,
			int numeroVettura, Scuderia scuderia) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.punti = punti;
		this.vittorieStagionali = vittorieStagionali;
		this.eta = eta;
		this.nazionalita = nazionalita;
		this.numeroVettura = numeroVettura;
		this.scuderia = scuderia;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public int getVittorieStagionali() {
		return vittorieStagionali;
	}
	public void setVittorieStagionali(int vittorieStagionali) {
		this.vittorieStagionali = vittorieStagionali;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getNazionalita() {
		return nazionalita;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	public int getNumeroVettura() {
		return numeroVettura;
	}
	public void setNumeroVettura(int numeroVettura) {
		this.numeroVettura = numeroVettura;
	}
	public Scuderia getScuderia() {
		return scuderia;
	}
	public void setScuderia(Scuderia scuderia) {
		this.scuderia = scuderia;
	}
	
	
}
