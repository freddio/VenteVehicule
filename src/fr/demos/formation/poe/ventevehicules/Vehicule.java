package fr.demos.formation.poe.ventevehicules;

public abstract class Vehicule {
	private Modele modele;
	private double prixHT;
	private String couleur;
	private String options;
	private Etat etat;
	private int annee;
	
	public Vehicule(Modele modele, double prixHT, String couleur, Etat etat, int annee) {
		super();
		this.modele = modele;
		this.prixHT = prixHT;
		this.couleur = couleur;
		this.etat=etat;
		this.annee = annee;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public Modele getModele() {
		return modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options=options;
	}
	// possibilité d'entrer une option sans tout resaisir
	public void addOption(String autreOption) {
		// en supposant que le délimiteur est ;
		if (this.options!=null){
			this.options=this.options+";"+autreOption;
		}else{
			this.options=autreOption;
		}
	}
	public int getAnnee() {
		return annee;
	}
	
	public String getEtat(){
		return etat.name();
	}
	@Override
	public String toString() {
		return "Vehicule [modele=" + modele + ", prixHT=" + prixHT + ", couleur=" + couleur + ", etat=" + etat
				+ ", annee=" + annee + "]";
	}
	
	
	
}
