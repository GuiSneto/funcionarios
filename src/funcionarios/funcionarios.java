package funcionarios;

//bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class funcionarios {

	private static String name;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hourswork = 0, cont1 = 0 , cont2 = 0, cont0 = 0, totalhours = 0, cont4 =0, opcao;
		double valueforhour = 0, valhours=0;
		char outro;
		
		//leitura de dados e validação
		

		while (cont0 == 0) {  
	        System.out.print("Nome: ");
	        name = sc.next();
	        cont0 = +1;
		
	       while ( cont1 == 0 ) {
	        System.out.print("Horas trabalhadas: ");
	        hourswork = sc.nextInt();
	        
	        if (hourswork >= 0) {
	        	cont1 = +1;
	        
	       }
	       }
	
	        while (cont2 == 0) {
	        System.out.print("Valor por hora: ");
	        valueforhour = sc.nextDouble();
	        
	        if (valueforhour >= 0) {
	        	cont2 = +1;
	        }
	        }
	        
	        System.out.print("Digitar outro (S/N)");
	        outro= sc.next().charAt(0);
	        
	        if (outro == 'S') {
	        	totalhours = totalhours + hourswork;
	        	valhours = valhours + valueforhour;
	        	cont1 = 0;
	        	cont2 = 0;
	        	cont0 = 0;
	        }
	        else {
	        	totalhours = totalhours + hourswork;
	        	valhours = valhours + valueforhour;
	        	cont0 = + 1;
	        }
	        
	        System.out.println("");
	        
	        while (cont4 == 0) {
	        	 System.out.println("MENU");
	        	 System.out.println("1 - Total de horas trabalhadas");
	        	 System.out.println("2 - Custo total");
	        	 System.out.println("3 - Sair");
	        	 System.out.printf("Digite uma opcao: ");
	        	 opcao = sc.nextInt();
	        	 System.out.println("");
	        	 
	        	 if (opcao == 1) {
	        		 System.out.println("Total de horas = " + totalhours);
	        		 System.out.println("");
	        		 
	        	 }
	        	 else if (opcao == 2) {
	        		System.out.printf("Custo total = %.2f%n", totalhours*valhours);
	        		System.out.println("");
	        	 }
	        	 else if (opcao == 3) {
	        		 cont4 = +1;
	        	 }
	        	 
	        	 
	        }
	        
		}   
	     
	       
		
        sc.close();
	}

}
