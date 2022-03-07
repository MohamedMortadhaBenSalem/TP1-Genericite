package Ex2;

class TestPile{
public static void main(String[]args){
PileListe p = new PileListe();
for(int i = 0 ; i < 10 ; i++)
p.empiler(new Integer(i));
while(!p.estVide()){
System.out.println((Integer) p.dernier());
p.depiler();
}
for(int i = 0 ; i < 10 ; i++)
p.empiler("L'entier " + i);
while(!p.estVide()){
	System.out.println(p.dernier());
	p.depiler();
}
}
}
