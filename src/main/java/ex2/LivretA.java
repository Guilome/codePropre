package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération annuel*/
	private double tauxRemuneration;
	
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde() + getSolde()*tauxRemuneration/100);
	}	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
