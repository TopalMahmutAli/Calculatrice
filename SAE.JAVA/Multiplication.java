/**
 * Création de la classe Multiplication
 */

public class Multiplication extends Operation {

	/**
	 * Les constructeurs
	 */

	public Multiplication(Expression Operande1, Expression Operande2) {
		super(Operande1, Operande2);
	}

	/**
	 * Les méthodes
	 */
	
	public int valeur() {
		return this.getOPerande1().valeur() * this.getOPerande2().valeur();
	}

	/**
	 * La méthode toString
	 */
	
	public String toString() {
		return  getOPerande1()+ " * "+ getOPerande2();
	}
}
