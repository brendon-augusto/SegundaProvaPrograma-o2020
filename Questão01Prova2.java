package br.edu.univas.main;

import java.util.Scanner;

public class Quest�o01Prova2 {
	public static void main(String [] args) {
		Scanner leitura = new Scanner(System.in);
		
		float pagamentoA [] = new float [12];
		float contaMa = 0;
		float contaMe = 0;
		float soma = 0;
		
		
		for (int i; i < 12; i++) {
			
			System.out.println("Digite os valores pagos foram do Morador A:");
			System.out.println("Janeiro:");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Fevereiro:");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Mar�o:");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Abril");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Maio");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Junho");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Julho");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Agosto" );
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Setembro");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Outubro");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Novembro");
			pagamentoA[i] = leitura.nextFloat();
			
			System.out.println("Dezembro");
			pagamentoA[i] = leitura.nextFloat();
			
			soma += pagamentoA[i];
			
			if( pagamentoA[i]< contaMe) {
					contaMe = pagamentoA[i];
			}
			 
			if (pagamentoA[i] > contaMa) {
				 	contaMa = pagamentoA[i];
			}
			
			}
				
			System.out.println("O maior valor pago pelo morador A" + contaMa);
				System.out.println("O menor valor pago pelo morador A" + contaMe);
				System.out.println("A m�dia dos valores pagos � de: " + soma / 12);
	
		
				
				
				float pagamentob[] = new float [12];
				float contabMa = 0;
				float contabMe = 0;
				float somab = 0;
				
				
				for (int b; b < 12; b++) {
					
					System.out.println("Digite os valores pagos foram do Morador B:");
					System.out.println("Janeiro:");
					pagamentoA[b] = leitura.nextFloat();
					
					System.out.println("Fevereiro:");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Mar�o:");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Abril");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Maio");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Junho");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Julho");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Agosto" );
					pagamentob [b] = leitura.nextFloat();
					
					System.out.println("Setembro");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Outubro");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Novembro");
					pagamentob[b] = leitura.nextFloat();
					
					System.out.println("Dezembro");
					pagamentob[b] = leitura.nextFloat();
					
					somab += pagamentoA[b];
					
					if( pagamentob[b]< contabMe) {
							contabMe = pagamentoA[b];
					}
					 
					if (pagamentob[b] > contabMa) {
						 	contabMa = pagamentob[b];
					}
					
					}
						
					System.out.println("O maior valor pago pelo morador b" + contabMa);
						System.out.println("O menor valor pago pelo morador b" + contabMe);
						System.out.println("A m�dia dos valores pagos � de: " + somab / 12);
			
				
	}
}	
				