import java.util.Scanner;

public class ChiffreRomain {
	
		public ChiffreRomain(int chiffre) {
			String res = "";
			String res2 = "";
			int reste =0;
			for (int i = 1; i <= chiffre; i++) {
				if (reste < 5 )
					res2+="I";
				if (i == 5) {
					res = "V";
					res2 = "";
				}
				if(i < 10 && i > 5)
					res += "I"; 
				
				if (i % 10 == 0) {
					res += "X";
					res2 ="";
					reste = chiffre-i;
				}
				
				if (i == 20)
					res = "XX";
				if(i == 50)
					res = "L";
			}
			res +=res2;
			System.out.println(res);
		}
		
		
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int chiffre = sc.nextInt();
			ChiffreRomain R = new ChiffreRomain(chiffre);
			
		}
		
		// Si 
		// Pour i allant de 1 à 4 ecrire des I
		// si i = 5 ecrire V 
		// pour i allant de 5 à 10 ecrire V + I
		// i = 10 ecrire X 
		
		

}
