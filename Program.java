package principal;

public class Program {

	public static void main(String[] args) {
		
		int soma = 0;
		for (int i = 1; i <= 25; i += 2) {
            System.out.println(i);
            soma += i; 
            
            
		}

	    System.out.println("A soma dos números ímpares é: " + soma);
	    
	    String numAbaixo = "";
        String numLado = "";
        
        for (int i = 1; i <= 25; i += 2) {
            numAbaixo += i + "\n";
            numLado += i + " ";
        }
        
        System.out.println("Um abaixo do outro:\n" + numAbaixo);
        System.out.println("Um do lado do outro: " + numLado);
	}

}
