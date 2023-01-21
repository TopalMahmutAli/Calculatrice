/**
 * Création de la classe Nombre
 */

public class Nombre extends Expression {
	private int valeurNombre;

	
	public int valeur(){
		return valeurNombre;}
	
	/**
	 * Les constructeurs
	 */

	
	// Constructeur champs à champs
	public Nombre(int valeurNombre) {
		this.valeurNombre = valeurNombre;
	}


	/**
	 * Les méthodes d'accès
	 */

	public int getValeurNombre() {
		return this.valeurNombre;
	}

	public void setValeurNombre(int valeurNombre) {
		this.valeurNombre = valeurNombre;
	}

	/**
	 * La méthode toString
	 */

	public String toString() {
		return String.valueOf(valeur());
		
	
	}
}
