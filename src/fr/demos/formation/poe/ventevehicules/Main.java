package fr.demos.formation.poe.ventevehicules;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		VeloElectrique ve1= new VeloElectrique
		(new Modele("solex","500sx"),1000,"noir",Etat.CORRECT,2014);
		ve1.setAutonomie(300);
		Velo v1= new Velo
				(new Modele("decathlon","230"),800,"noir",Etat.CORRECT,2014);
		
		
		// essai de HashMap
		HashMap<String,Voiture> listeVoitures = new HashMap<>();
		Modele peugeot206 = new Modele("peugeot","206");
		Voiture vo1 = new Voiture(peugeot206,1000,"rouge",Etat.CORRECT,2008,"12AA75");
		listeVoitures.put(vo1.getImmatriculation(), vo1);
		Voiture vo2 = listeVoitures.get("12AA75");
		//System.out.println(vo2);
		
		// je crée maintenant un garage de vélos
		Garage<Velo> garage = new Garage<>("Vente vélos La Défense");
		garage.ajouter(v1);
		garage.ajouter(ve1);
		for(Velo v:garage){
			System.out.println(v);
		}
		

	}

}
