/**
 * 
 */
package ex3.corrigé;

/**
 * @author GOBERT Guillaume
 *
 */
public class FermeReptile extends Zone{

	/**
	 * Constante designant le poids de nourriture par animal et par jour
	 */
	public static final double POIDS_NOURRITURE = 0.1;
	
	/**
	 * Constructeur
	 *
	 */
	public FermeReptile() {
		
	}

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.REPTILE)) {			
			getListeAnimaux().add(animal);
		}
	}

	@Override
	double getPoids() {
		
		return POIDS_NOURRITURE;
	}
	
	
}
