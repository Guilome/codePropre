/**
 * 
 */
package ex3.corrigé;

/**
 * @author GOBERT Guillaume
 *
 */
public class ZoneCarnivore extends Zone{
	
	/**
	 * Constante designant le poids de nourriture par animal et par jour
	 */
	public static final double POIDS_NOURRITURE = 10;
	
	/**
	 * Constructeur
	 *
	 */
	public ZoneCarnivore() {
		
	}
	
	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE) && animal.getAlimentation().equals(Alimentation.CARNIVORE)) {			
			getListeAnimaux().add(animal);
		}
	}
		
	@Override
	double getPoids(){
		return POIDS_NOURRITURE;
	}
}
