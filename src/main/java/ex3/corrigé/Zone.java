/**
 * 
 */
package ex3.corrigé;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GOBERT Guillaume
 *
 */
public abstract class Zone {
	
	private List<Animal> listeAnimaux = new ArrayList<>();
	
	/**
	 * Ajoute les animaux en vérifiant que leur type correspond a la zone
	 * @param animal
	 */
	public abstract void addAnimal(Animal animal);
	
	/**
	 * Affiche tous les animaux présent dans la zone
	 */
	public void afficherListeZone(){
		for (Animal animal: listeAnimaux){
			System.out.println(animal.toString());
		}
	}
	
	/**
	 * Retourne le nombre d'animaux dans la zone
	 */
	public int compterAnimaux(){
		return listeAnimaux.size();
	}
	
	/**
	 * Calcul la quantité total de nourriture pour tous les animaux
	 * @return
	 */
	public double calculerKgsNourritureParJour(){
		return getListeAnimaux().size() * getPoids();
	}

	/**
	 * @return poids
	 */
	abstract double getPoids();
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
	

}
