package test_pgrm;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombreChoix = 0;
		
		ArrayList<Double> calcul = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de nombres avez vous à calculer?");
		nombreChoix = sc.nextInt();
		
		for(int i = 0; i < nombreChoix; i++) {
			System.out.println("Veuillez saisir le chiffre: ");
			double nb = sc.nextDouble();
			calcul.add(nb);
		}
		
		System.out.println("Quel calcul voulez vous effectuer?\n");
		System.out.println("Taper le chiffre correspondant : \n");
		System.out.println("\t1: Addition\n\t2: Soustraction\n\t3: Division\n\t4: Multiplication");
		int choix = sc.nextInt();
		
		switch(choix) {
		case 1:
			double add = 0;
			for(int i = 0; i < calcul.size(); i++)
				add += calcul.get(i);
			System.out.println("Le résultat de l'addition est: " + add);
			break;
		case 2:
			double sous = 0;
			for(int i = 0; i < calcul.size(); i++)
				sous -= calcul.get(i);
			System.out.println("Le resultat de la soustraction est: " + sous);
			break;
		case 3:
			double div = 0;
			for(int i = 0; i < calcul.size(); i++)
				div /= calcul.get(i);
			System.out.println("Le résultat de la soustraction est: " + div);
			break;
		case 4:
			double multi = 0;
			for(int i = 0; i < calcul.size(); i++)
				multi *= calcul.get(i);
			System.out.println("Le résultat de la multiplication est: " + multi);
			break;
		}
	}

}
