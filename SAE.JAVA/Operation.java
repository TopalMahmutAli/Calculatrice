/**
 * Création de la classe abstraite Opération
 */

public abstract class Operation extends Expression{
	private Expression Operande1;
	private Expression Operande2;
	
	
	/**
	 * Les constructeurs
	 */


	public Operation(Expression Operande1, Expression Operande2) { 
	this.Operande1 = Operande1;
	this.Operande2 = Operande2;
	}
	
	/**
	 * Les méthodes
	 */

	public Expression getOPerande1() {
		return this.Operande1;
	}

	public Expression getOPerande2() {
		return  this.Operande2;
	}
	
	public abstract int valeur();
	
	/**
	 * getters
	 */

	public Expression getOperande1(){
		return this.Operande1;
		}
		
		
	public Expression getOperande2(){
		return this.Operande2;
		}
		
	/**
	 * setters
	 */
	 
	 public void setOperande1(Expression op){
	 	this.Operande1 = op;
	 	}
	 
	public void setOperande2(Expression op){
	 	this.Operande2 = op;
	 	} 
}
