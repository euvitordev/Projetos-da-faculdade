import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int number1, number2, produto=1;
          char opcao = 0;
          String mensagem = "", mensagemEntrada = "Digite 1 para adição\n Digite 2 para somatoria";

	
	  //Entrada de dados
	  number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
	  number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
	  opcao = (JOptionPane.showInputDialog(mensagemEntrada)) .charAt(0);
	
	  //Processamento
	  switch (opcao)
	  {
	  	case '1': 
	  	{
	  	   if (number1 > 0 && number2 > 0)
	  	   {
	  	   	produto = number1 + number2;
	  	   	mensagem = "Soma de " + number1 + " por " + number2 + " = " + produto + "\n\n";
	  	   }
	  	   else
	  	   {
	  	   	mensagem = "Erro: os números digitados devem ser positivos";
	  	   }
	  	   break;
	  	}
	  	case '2':
	  	{
	  	   if (number1 <= 0 || number2 <= 0) 
	  	   {
      			mensagem = "Erro: os números digitados devem ser positivos.";
		   }
		   else 
		   {
      			for (int i = 1; i<=number2; i=i+1)
      			{
         			produto = produto * number1;
     			}
      		  mensagem = "A produtoria de " + number1 + ", " + number2 + " vezes é " + produto + "\n\n";
   		   }
	  	   break; 
	  	}

	  	default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados");
	  }
	
	  //Saida de resultados
	  if (opcao >= '1' && opcao <= '2'){
		JOptionPane.showMessageDialog(null, mensagem);
	  }
	
	  System.exit(0);
    }
}
