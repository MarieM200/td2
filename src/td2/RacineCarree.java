package td2;

/**
 * RacineCarre est une classe qui hérite de Expr 
 * @see Eval
 * Elle permet de donner la racine carree d'un nombre
 * 
 * @author magny
 *
 */
public class RacineCarree implements Expr{
	private double val;
	char c = '\u221a';
	
	/**
	 * Constructeur de la classe RacineCarree
	 * @param val
	 * 		la valeur de depart sur laquelle on va appliquer la racine carree
	 * 
	 */
	public RacineCarree(double val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	/**
	 * Permet de calculer la valeur de la racine carree
	 * 
	 * @return la valeur de la racine carree
	 */
	@Override
	public double eval() {
		return Math.sqrt(val);
	}
	
	/**
	 * Affiche l'expression arithmetique de racine carree non evaluee
	 */
	public void affichage() {
		System.out.println("Racine Carree: " + c + val + " = ");
	}
}
