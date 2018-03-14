package ex3.corrigé;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> listeAnimaux = new ArrayList<>();
	private String nom;
	private List<Zone> listeZones = new ArrayList<>();
	
	/**
	 * Constructeur
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		listeZones.add(new Aquarium());
		listeZones.add(new FermeReptile());
		listeZones.add(new SavaneAfricaine());
		listeZones.add(new ZoneCarnivore());		
	}
	
	/**
	 * Ajouter un animal au zoo et à sa zone
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		listeAnimaux.add(animal);
		for(Zone zone : listeZones){
			zone.addAnimal(animal);
		}
	}
	/**
	 * Affiche tous les animaux du zoo
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: listeAnimaux){
			System.out.println(animal.toString());
		}
	}
	/**
	 * Retourne le nombre d'animaux dans le zoo
	 * @return listeAnimaux.size()
	 */
	public int compterAnimaux(){
		return listeAnimaux.size();
	}
	
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the listeAnimaux
	 */
	public List<Animal> getListeAnimaux() {
		return listeAnimaux;
	}

	/** Setter
	 * @param listeAnimaux the listeAnimaux to set
	 */
	public void setListeAnimaux(List<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}

	/** Getter
	 * @return the listeZones
	 */
	public List<Zone> getListeZones() {
		return listeZones;
	}

	/** Setter
	 * @param listeZones the listeZones to set
	 */
	public void setListeZones(List<Zone> listeZones) {
		this.listeZones = listeZones;
	}	
}
