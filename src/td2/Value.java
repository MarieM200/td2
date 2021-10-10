package td2;

/**
 * Value est une classe qui hérite de Expr et qui implemente Eval
 * @see Expr
 * @see Eval
 * Elle permet de definir un nombre
 * 
 * @author magny
 *
 */
public class Value extends Expr implements Eval{
	private double val;
	
	/**
	 * Constructeur de la classe Value
	 * @param val
	 * 		la valeur de depart
	 * 
	 */
	public Value(double val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	/**
	 * Permet de retourner la valeur de l'expression
	 * 
	 * @return la valeur de l'expression
	 */
	@Override
	public double eval() {
		return val;
	}
	
	/**
	 * Affiche l'expression arithmetique d'une valeur non evaluee
	 */
	@Override
	public void affichage() {
		System.out.println("Value: " + val + " = ");
	}
}
