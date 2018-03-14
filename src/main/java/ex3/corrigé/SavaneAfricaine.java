/**
 * 
 */
package ex3.corrigé;

/**
 * @author GOBERT Guillaume
 *
 */
public class SavaneAfricaine extends Zone{

	/**
	 * Constante designant le poids de nourriture par animal et par jour
	 */
	public static final double POIDS_NOURRITURE = 10;
	
	/**
	 * Constructeur
	 *
	 */
	public SavaneAfricaine() {

	}
	
	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE) && animal.getAlimentation().equals(Alimentation.HERBIVORE)) {			
			getListeAnimaux().add(animal);
		}
	}	
	
	@Override
	double getPoids() {
		return POIDS_NOURRITURE;
	}	
}
