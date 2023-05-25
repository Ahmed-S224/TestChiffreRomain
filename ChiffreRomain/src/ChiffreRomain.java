import java.util.Scanner;

public class ChiffreRomain {
	
		private static Scanner sc;

		/*
		 * Methode pour convertir les chiffres arabes en chiffres romains
		 * 
		 * */
		public static String ConversionChiffreRomain(int chiffreArabe) {
			String chiffreRomain = "";
			int reste =0;
			if(chiffreArabe >= 1000) {	//Traitement pour la conversion de 1000 en M
				for (int i = 1000; i <= chiffreArabe; i+=1000) {
					chiffreRomain+="M";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			
			if (chiffreArabe >= 900) { //Traitement Spécifique pour les 900 en CM
				chiffreRomain+="CM";
				chiffreArabe -= 900;
				reste =0;
				
			}
			
			if(chiffreArabe >= 500) {	//Traitement pour la conversion de 500 en D
				for (int i = 500; i <= chiffreArabe; i+=500) {
					chiffreRomain+="D";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			
			if (chiffreArabe >= 400) {	//Traitement Spécifique pour les 400 en CD
				chiffreRomain+="CD";
				chiffreArabe -= 400;
				reste =0;
				
			}
			
			if(chiffreArabe >= 100) {	//Traitement pour la conversion de 100 en C
				for (int i = 100; i <= chiffreArabe; i+=100) {
					chiffreRomain+="C";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			
			if (chiffreArabe >= 90) {	//Traitement Spécifique pour les 90 en XC
				chiffreRomain+="XC";
				chiffreArabe -= 90;
				reste =0;
				
			}
			
			if(chiffreArabe >= 50) {	//Traitement pour la conversion de 50 en L
				for (int i = 50; i <= chiffreArabe; i+=50) {
					chiffreRomain+="L";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			
			if (chiffreArabe >= 40) {	//Traitement Spécifique pour les 40 en XL
				chiffreRomain+="XL";
				chiffreArabe -= 40;
				reste =0;
				
			}
			
			if(chiffreArabe >= 10) {	//Traitement pour la conversion de 10 en X
				for (int i = 10; i <= chiffreArabe; i+=10) {
					chiffreRomain+="X";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			
			if (chiffreArabe == 9) {	//Traitement Spécifique pour les 9 en IX
				chiffreRomain+="IX";
				chiffreArabe -= 9;
				reste =0;
				
			}
			
			if(chiffreArabe >= 5) {	//Traitement pour la conversion de 5 en V
				for (int i = 5; i <= chiffreArabe; i+=5) {
					chiffreRomain+="V";
					reste = chiffreArabe -i;
				}
				chiffreArabe = reste;
				reste = 0;
				
			}
			if (chiffreArabe == 4) {	//Traitement Spécifique pour les 4 en IV
				chiffreRomain+="IV";
				chiffreArabe -= 4;
				reste =0;
				
			}
			for (int i = 1; i <= chiffreArabe; i++) {	//Traitement pour la conversion de 1 en I
				chiffreRomain+="I";
				
			}
			return (chiffreRomain);
		}
		
		
		public static void main (String[] args) {
			System.out.println("Veuillez saisir votre chiffre arabe");
			
			sc = new Scanner(System.in);
			int chiffre = sc.nextInt();
			
			String test = ConversionChiffreRomain(chiffre);
			System.out.println("Le chiffre arabe "+ chiffre +" est " + test + " en chiffre romain");
			
		}
		
		

}
