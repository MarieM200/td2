package td2;

/**
 * Expr est une classe implemente Eval et qui est la classe mere de Value, Add, Multiplication et RacineCarree
 * @see Value
 * @see Add
 * @see Multiplication
 * @see RacineCarree
 * @see Eval
 * 
 * @author magny
 *
 */
public class Expr implements Eval{
	/**
	 * Constructeur de la classe Expr
	 * 
	 */
	public Expr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Permet de retourner la valeur de l'expression
	 * 
	 * @return la valeur de l'expression
	 */
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Affiche l'expression arithmetique non evaluee
	 */
	@Override
	public void affichage() {
		// TODO Auto-generated method stub
	}
	
}
