
public class PointcoloreNG extends Point<Integer>{
	String couleur;
	PointcoloreNG(char nom, Integer abs, Integer ord, String couleur)
	{
		super(nom,abs,ord);
		this.couleur=couleur;
	}
	@Override
	public String toString() {
		return super.toString()+"PointcoloreNG [couleur= "+ couleur + "]";
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
