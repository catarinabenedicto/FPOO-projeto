package pacote;

public class Media {

	public static void main(String[] args) {
		
         int nota1 = 8;
		 int nota2 = 9;
		 int nota3 = 10;
		 int nota4 = 10;
		 int media;
		 
		 media = (nota1 + nota2 + nota3 + nota4) /4 ;
		
			   if(media> 7) {
				   System.out.println("APROVADO");
				   
			   }else if (media >= 5 && media <= 7 ) {
				   System.out.println("RECUPERA��O");
				   
			   }else {
				   System.out.println("REPROVADO");
			   }
		   
	}

	}


