package metodo;

import java.util.Scanner;

public class sla {
	static Scanner entrada = new Scanner(System.in);
	static double mediaCheck = 0, mediaCS=0,media1=0,media2=0;
	public static void check() {
		double check1 = 0, check2 = 0, check3 = 0;

		System.out.println("digite a nota do 1 checkpoint ");
		check1 = entrada.nextDouble();
		System.out.println("digite a nota do 2 checkpoint ");
		check2 = entrada.nextDouble();
		System.out.println("digite a nota do 3 checkpoint ");
		check3 = entrada.nextDouble();

		if (check1 < check2 && check1 < check3) {
			mediaCheck = check2 + check3 / 2;
		} else {
			if (check2 < check1 && check2 < check3) {
				mediaCheck = check1 + check3 / 2;
			} else {
				if (check3 < check2 && check3 < check1) {
					mediaCheck = check2 + check1 / 2;
				}
			}
		}

	}
	public static void sprint() {
		
		//Sprint = 60%
		//Check-Pont = 40%
		double mediacp = 0, mediasp = 0, mediaSprint = 0;
		
		mediacp = mediaCheck * 0.40;
		mediasp = mediaSprint * 0.60;

		
		
		
	}
	public static void zera() {
		mediaCheck = 0;
		mediaCS=0;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---1 semestre------ ");
		check();
		sprint();
		System.out.println("digite a sua nota da gs");
		
		
		
		System.out.println("---2 semestre------ ");
		zera();
		check();
		sprint();
	}

}






