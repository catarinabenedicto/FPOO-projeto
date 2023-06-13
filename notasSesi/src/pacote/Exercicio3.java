package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
        String codigo;
        
        double salario = 0, total = 0, x, y;
        
        codigo = JOptionPane.showInputDialog("DIGITE O CÓDIGO:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SEU SALÁRIO:"));
        
        switch (codigo) {
        case "1":
        	y = salario;
        	x = y / 100;
        	total = salario + (x * 50);
        	
        	JOptionPane.showInputDialog(null, "CARGO: ESCRITUARIO " + "  SEU ATUAL SALÁRIO:  " + total + " TEVE UM AUMENTO DE 50%");
        	
        	break;
        	
        case "2":
        	y = salario;
        	x = y / 100;
        	total = salario + (x * 35);
        	
        	JOptionPane.showMessageDialog(null, "CARGO: SECRETÁRIO " + "  SEU ATUAL SALÁRIO:  " + total + " TEVE UM  AUMENTO DE 35%");
        	
        	break;
        	
        case "3":
        	y = salario;
        	x = y / 100;
        	total = salario + (x * 20);
        	
        	JOptionPane.showMessageDialog(null, "CARGO: CAIXA " + "  SEU ATUAL SALÁRIO: " + total + " TEVE UM AUMENTO DE 20%");
        	
        	break;
        	
        case "4":
        	y = salario;
        	x = y / 100;
        	total = salario + (x * 10);
        	
        	JOptionPane.showMessageDialog(null, "CARGO: GERENTE " + "  SEU ATUAL SALÁRIO: " + total + " TEVE UM AUMENTO DE 10%");
        	
        	break;
        	
        case "5":
        	
        	total = salario;
        	
        	JOptionPane.showMessageDialog(null, "CARGO: DIRETOR " + "  SEU ATUAL SALÁRIO" + total + "SEU CARGO NÃO TEM AUMENTO");
        	
        	break;
        	
        	default:
        	break;
        	
        }
		
		

	}

}
