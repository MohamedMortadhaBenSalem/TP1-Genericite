package Ex2Generique;

class PileListe <T> implements Pile<T>{
private Noeud<T> sommet;
public PileListe(){
sommet = null;
}
public boolean estVide(){
return (sommet == null);
}
public Object dernier(){
return sommet.info;
}
public void empiler(Object o){
Noeud n = new Noeud();
n.info = o;
n.suivant = sommet;
sommet = n;
}
public void depiler(){

sommet = sommet.suivant;
}
}
