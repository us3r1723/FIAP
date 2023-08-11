package sla;
import java.util.Scanner;
public class upnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y =0;
		int ctl=0;
		int soma0=0,soma1=0,soma2=0,soma3=0;
		int[] vet1 = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17,19 };
		int[] vet2 = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18 ,20};
		int[] vet3 = new int[20];
		Scanner entrada = new Scanner(System.in);
		int[][] matrix = new int[4][4]; // Vetor de vetores para armazenar os valores de cada

		
		/*
tutorial matrix
		            ex: matrix 3x3
double[][] matrix = new double[3][3];
	
		
		 [y][x] -->>>>
		  |		1	2	3	
		  v		3	5	6
		  v		7	8	9
		
		
       ex:1	  onde fica o 8?
       			
modo de leitura da matrix       	 
		 [y][x] -->>>>       	
		  |		1	2	3	
		  v		3	5	6
		  v		7	8	9
		
como ele le  primeiro o y como visto acima 
		
		observando a matrix podemos ver que o 8 esta na 3 linha do esquema mas devemos nos lembrar
		que começamos contando a partir do 0 ao inves de 1  entao o y do do 8 equivale a 2 linha como descrito 
		no esquema abaixo 

		 [y][x] -->>>>       	
		  |		1	2	3	
		  v		3	5	6
		  *		7	8	9
		
		
	
		*/
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Digite o valor [Linha "+i+" - Coluna "+j+"]:");
				matrix[y][x]=entrada.nextInt();
			}}
				
		System.out.println(matrix[0][0]);
		System.out.println(matrix[0][1]);
		System.out.println(matrix[0][2]);
		System.out.println(matrix[0][3]);
		while (ctl < 4) {
			while(x<4) {
				soma0 += (matrix[ctl][x]); //soma custo
				x++;
			}
		
			System.out.println("a soma da linha "+ctl+" e de "+soma0);

			ctl++;
		}
		
		ctl=0;
		while (ctl<20) {
			System.out.println(vet3[x]);
			ctl++;
		}
	}

}
