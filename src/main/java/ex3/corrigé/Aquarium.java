/**
 * 
 */
package ex3.corrigé;

/**
 * @author GOBERT Guillaume
 *
 */
public class Aquarium extends Zone{


	/**
	 * Constante designant le poids de nourriture par animal et par jour
	 */
	public static final double POIDS_NOURRITURE = 0.2;
	
	/**
	 * Constructeur
	 *
	 */
	public Aquarium(){
		
	}

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.POISSON)) {			
			getListeAnimaux().add(animal);
		}
	}

	@Override
	double getPoids() {		
		return POIDS_NOURRITURE;
	}
	
	
}
