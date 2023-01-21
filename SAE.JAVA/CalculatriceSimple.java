public class CalculatriceSimple {

	public static void main (String[] args){
	
	try{
	Nombre six = new Nombre(6);
	Nombre dix = new Nombre(10);
	Nombre zero = new Nombre(0);
	
	Operation s = new Soustraction(dix,six);
	Operation a = new Addition(dix,six);
	Operation m = new Multiplication(dix,six);
	Operation d = new Division(dix, six);
	Operation z = new Division(dix, zero);
	
	System.out.println(s+"="+s.valeur());
	System.out.println(a+"="+a.valeur());
	System.out.println(m+"="+m.valeur());
	System.out.println(d+"="+d.valeur());
	System.out.println(z+"="+z.valeur());
	}
	
	catch(ArithmeticException e){
		System.out.println("Une erreur est présente "+e.toString());
	}
	
	
	
	}	
}
