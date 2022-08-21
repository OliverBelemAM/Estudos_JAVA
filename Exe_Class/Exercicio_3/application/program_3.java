package application;

import java.util.Locale;
import java.util.Scanner;
import entities.notes;

public class program_3 {
	
	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		notes note = new notes();
		
			System.out.println("Nome do aluno:");
				note.name = sc.nextLine();
			System.out.println("Notas: ");
				note.n1 = sc.nextDouble();
				note.n2 = sc.nextDouble();
				note.n3 = sc.nextDouble();
				
			System.out.printf("FINAL GRADE: %.2f%n", note.nFinal());				
			
			if (note.nFinal() < 60.0) {
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS%n", note.notaFalta());
			}
			else {
				System.out.println("PASS");
			}
			
			
		sc.close();
	}
	
}
