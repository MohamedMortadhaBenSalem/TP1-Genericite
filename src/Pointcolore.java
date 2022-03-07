
public class Pointcolore <T,T1> extends Point<T>{
	 private T1 couleur;
		Pointcolore(char nom, T abs, T ord, T1 couleur)
		{
			super(nom,abs,ord);
			this.couleur=couleur;
		}
		public T1 getCouleur() {
			return couleur;
		}
		public void setCouleur(T1 couleur) {
			this.couleur = couleur;
		}
		@Override
		public String toString() {
			return super.toString()+"Pointcolore [couleur= "+ couleur + "]";
		}
		
		
}
