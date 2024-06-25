package entities;

public class dados {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double total() {
		return nota1 + nota2 + nota3;
		
	}
	
	public double reprovado() {
		if (total() < 60) {
			return 60 - total();
		}
		else {
			return 0;
		}
	}
	
				
}
		
			
	

