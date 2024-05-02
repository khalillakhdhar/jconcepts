package jconcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordinateur o1=new Ordinateur("toshiba", "i7", 24, 3000);
		// o1 sera libérer automatiquement => bonne pratique
		Ordinateur o2=new Ordinateur();
		System.out.println(o1.toString());
		/*o2.cpu="i5";
		o2.marque="Asus";
		o2.prix=5000;
		o2.ram=16;
	*/
		// la memoire restera occupé => mauvaise pratique
		

	}

}
