
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer>P1=new Point<>('A', 1, 10);
		Point<Double>P2=new Point<>('B',2.3,4.4);
		Point<Integer>P3=new PointcoloreNG('C',4,3,"Rouge");
		Point<Integer>P4=new Pointcolore<>('D',9,2,"Blue");
		Point<Double>P5=new Pointcolore<>('E',2.6,2.8,"Vert");
		CouleurRVB CO1= new CouleurRVB(12,28,91);
		Cercle<Integer>C1=new Cercle<>(50,P1);
		CercleRestriction C2=new CercleRestriction(30,P2);
		P1.toString();
		P2.toString();
		P3.toString();
		P4.toString();
		P5.toString();
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
		System.out.println(P4);
		System.out.println(P5);
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(CO1);


	}

}
