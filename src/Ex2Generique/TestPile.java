package Ex2Generique;

class TestPile{
public static void main(String[]args){
PileListe <Integer>p = new PileListe<Integer>();
for(int i = 0 ; i < 10 ; i++)
p.empiler(new Integer(i));
while(!p.estVide()){
System.out.println((Integer) p.dernier());
p.depiler();
}
}
}