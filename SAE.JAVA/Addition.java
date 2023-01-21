/**
 * Création de la classe Addition
 */

public class Addition extends Operation {

	/**
	 * Les constructeurs
	 */

	// Constructeur 
	public Addition(Expression Operande1, Expression Operande2) {
		super(Operande1, Operande2);
		}
	/**
	 * Les méthodes
	 */
	
	public int valeur() {
		return this.getOPerande1().valeur() + this.getOPerande2().valeur();
	}

	/**
	 * La méthode toString
	 */
	
	public String toString() {
		return  getOperande1()+ " + "+getOperande2(); 
	}
}
