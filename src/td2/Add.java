package td2;

/**
 * Add est une classe qui hérite de Expr et qui implemente Eval
 * @see Expr
 * @see Eval
 * Elle permet de donner la somme de deux nombres
 * 
 * @author magny
 *
 */
public class Add extends Expr implements Eval{
	private Expr val1;
	private Expr val2;
	
	/**
	 * Constructeur de la classe Add
	 * @param val1
	 * 		l'une des valeurs de depart sur lesquelles on va appliquer l'addition
	 * @param val2
	 * 		l'autre valeur de depart sur laquelle on va appliquer l'addition
	 * 
	 */
	public Add(Expr val1, Expr val2) {
		// TODO Auto-generated constructor stub
		this.val1 = val1;
		this.val2 = val2;
	}
	
	/**
	 * Permet de calculer la valeur de la somme
	 * 
	 * @return la valeur de la somme
	 */
	@Override
	public double eval() {
		return this.val1.eval() + this.val2.eval();
	}
	
	/**
	 * Affiche l'expression arithmetique d'une somme non evaluee
	 */
	@Override
	public void affichage() {
		System.out.println("Add: " + val1.eval() + " + " + val2.eval() + " = ");
	}
}
