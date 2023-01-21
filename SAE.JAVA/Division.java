/**
 * Création de la classe Division
 */

public class Division extends Operation {

	/**
	 * Les constructeurs
	 */

	
	public Division(Expression Operande1, Expression Operande2) {
		super(Operande1, Operande2);
	}

	/**
	 * Les méthodes
	 */
	
	public int valeur() throws ArithmeticException {
		return this.getOPerande1().valeur() / this.getOPerande2().valeur();
	}

	/**
	 * La méthode toString
	 */
	
	public String toString() {
		return getOPerande1()+ " / "+ getOPerande2();
	}
}
