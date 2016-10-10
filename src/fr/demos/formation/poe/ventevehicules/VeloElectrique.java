package fr.demos.formation.poe.ventevehicules;

public class VeloElectrique extends Velo implements Electrique {
	private int autonomie;
	private int tempsCharge;
	private String batterie;
	private double bonus;
	
	public VeloElectrique(Modele modele, double prixHT, String couleur, Etat etat, int annee) {
		super(modele, prixHT, couleur, etat, annee);	
	}

	@Override
	public int getAutonomie() {
		// TODO Auto-generated method stub
		return autonomie;
	}

	@Override
	public int getTempsCharge() {
		// TODO Auto-generated method stub
		return tempsCharge;
	}

	@Override
	public String getTypeBatterie() {
		// TODO Auto-generated method stub
		return batterie;
	}

	@Override
	public double getBonusEcologique() {
		// TODO Auto-generated method stub
		return bonus;
	}
	

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public void setTempsCharge(int tempsCharge) {
		this.tempsCharge = tempsCharge;
	}

	public void setBatterie(String batterie) {
		this.batterie = batterie;
	}

}
