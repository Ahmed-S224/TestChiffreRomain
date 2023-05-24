import java.lang.Class;


public class Test {
		public String IsTrois(int chiffre) {
			assert("III",ChiffreRomain(chiffre));
		}
		
		public String IsQuatre(int chiffre) {
			assert("IV",chiffre);
		}
		public String IsSept(int chiffre) {
			assert("VII",chiffre);
		}
		public String IsNeuf(int chiffre) {
			assert("IX",chiffre);
		}
		public String IsDix(int chiffre) {
			assert("X",chiffre);
		}
		public String IsDixSept(int chiffre) {
			assert("XVII",chiffre);
		}
		
		public String IsTrente(int chiffre) {
			assert("XXX",chiffre);
		}
		
		public String IsTrenteHuit(int chiffre) {
			assert("XXXVIII",chiffre);
		}
		
		public String IsQuatreSeptNeuf(int chiffre) {
			assert("CDLXXIX",chiffre);
		}
		
		public String IsTroisNeufNeufNeuf(int chiffre) {
			assert("MMMCMXCIX",chiffre);
		}
}
