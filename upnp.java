package sla;

public class upnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		int i =0;
		int[] vet1 = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17,19 };
		int[] vet2 = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18 ,20};
		int[] vet3 = new int[20];
		while (j < 10) {
			
			vet3[i]=vet1[j];
			System.out.println(vet1[j]);
			i++;
			vet3[i]=vet2[j];
			
			System.out.println(vet2[j]);
			j++;
			i++;
		}
		
		j=0;
		while (j<20) {
			System.out.println(vet3[j]);
			j++;
		}
	}

}
