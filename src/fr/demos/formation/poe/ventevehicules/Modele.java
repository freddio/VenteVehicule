package fr.demos.formation.poe.ventevehicules;

public class Modele {
	private String marque;
	private String ref;
	
	public Modele(String marque, String ref) {
		super();
		this.marque = marque;
		this.ref = ref;
	}
	public String getMarque() {
		return marque;
	}
	public String getRef() {
		return ref;
	}
	@Override
	public String toString() {
		return "Modele [marque=" + marque + ", ref=" + ref + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modele other = (Modele) obj;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	
	

}
