
public class CouleurRVB {
	 private int rouge;
	 private int vert;
	 private int blue;
	public CouleurRVB(int rouge, int vert, int blue) {
		super();
		this.rouge = rouge;
		this.vert = vert;
		this.blue = blue;
	}
	@Override
	public String toString() {
		return "CouleurRVB [rouge=" + rouge + ", vert=" + vert + ", blue="
				+ blue + "]";
	}
	public int getRouge() {
		return rouge;
	}
	public void setRouge(int rouge) {
		this.rouge = rouge;
	}
	public int getVert() {
		return vert;
	}
	public void setVert(int vert) {
		this.vert = vert;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}


}
