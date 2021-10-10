package td2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		
		//mere.miage();
		fille.miage();
		//mereFille.miage();
		((Fille)mereFille).miage();
		
		mere.a();
		mereFille.a();
		fille.a();
		((Mere)mereFille).a();
		mereFille.b(null);
		
		mereFille.c();
		mereFille.c(mere);
		mereFille.c(mereFille);
		mereFille.c(fille);
		fille.c(fille);
		
		mere.d();
		mereFille.d();
		
		mere.printF();
		mereFille.printF();
		
		//mereFille.j();
		//mereFille.k();
		//mereFille.l();
		//mereFille.m();
		
		
		Expr val = new Value(1337.0);
		val.affichage();
		System.out.println(val.eval()); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		add.affichage();
		System.out.println(add.eval()); //affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		e.affichage();
		System.out.println(e.eval()); //affiche 2014.0
		Expr m = new Multiplication(new Value(2.0), val);
		m.affichage();
		System.out.println(m.eval());
		Expr r = new RacineCarree(25.0);
		r.affichage();
		System.out.println(r.eval());
	}

}
