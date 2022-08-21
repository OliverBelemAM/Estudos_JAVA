package entities;

public class notes {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	
		public double nFinal() {	
			return n1 + n2 + n3;
		}
		
		public String toString() {
			return "Final Grade = " + nFinal();	
		}
	
		public double notaFalta() {
			
			if (nFinal() < 60.0 ){
				return 60.0 - nFinal();
			}
			else {
				return 0.0;
			}
		}
}
