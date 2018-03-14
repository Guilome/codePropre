package ex3.corrigé;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal animal = new Animal("Gazelle", Alimentation.HERBIVORE, Type.MAMMIFERE);
		Animal animal2 = new Animal("Zèbre", Alimentation.HERBIVORE, Type.MAMMIFERE);
		Animal animal3 = new Animal("Lion", Alimentation.CARNIVORE, Type.MAMMIFERE);
		Animal animal4 = new Animal("Panthère", Alimentation.CARNIVORE, Type.MAMMIFERE);
		Animal animal5 = new Animal("Requin blanc", Alimentation.CARNIVORE, Type.POISSON);
		Animal animal6 = new Animal("Truite dorée", Alimentation.HERBIVORE, Type.POISSON);
		Animal animal7 = new Animal("Boa constrictor", Alimentation.CARNIVORE, Type.REPTILE);
		Animal animal8 = new Animal("Python", Alimentation.CARNIVORE, Type.REPTILE);
		
		
		zoo.addAnimal(animal);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		zoo.addAnimal(animal4);
		zoo.addAnimal(animal5);
		zoo.addAnimal(animal6);
		zoo.addAnimal(animal7);
		zoo.addAnimal(animal8);
		
		System.out.println("Tous les animaux  :");
		System.out.println("Nombre  : " + zoo.compterAnimaux());	
		zoo.afficherListeAnimaux();	
		for(Zone zone : zoo.getListeZones()){
			System.out.println("***** "+ zone.getClass().getSimpleName() +" *****");
			System.out.println("Nombre  : " + zone.compterAnimaux());	
			System.out.println("Nourriture  : " + zone.calculerKgsNourritureParJour() + "Kg");		
			zone.afficherListeZone();
		}
	}

}
