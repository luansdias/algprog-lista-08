import java.util.Scanner;
import java.util.ArrayList;

public class L8E3 {
    public static void main(String[] args) {
      
      double numeros;
      double soma = 0;
      double media;
      int qtdmedia = 0;
      int qtd7 = 0;
      
      ArrayList<Double> lista = new ArrayList<Double>();
      Scanner leia = new Scanner(System.in);
      
      while (true) {
          System.out.println("Digite um número, ou, se deseja encerrar, digite -1:");
          numeros = leia.nextDouble();
          
          if(numeros == -1) {
              break;
          }
          
          lista.add(numeros);
          
          soma += numeros;
     
      }
      
      media = soma / lista.size();
      
      System.out.println("Quantidade de números digitados: " + lista.size());
      System.out.print("Números na ordem informada: " + lista + " ");
      System.out.println("\nNúmeros na ordem inversa:");
      for(int x = (lista.size() - 1); x >= 0; x--) {
          System.out.println(lista.get(x));
      }
      System.out.println("Soma dos números: " + soma);
      System.out.println("Média dos números: " + media);
      System.out.println("Números acima da média:");
      for(int x = 0; x < lista.size(); x++) {
          if(lista.get(x) > media) {
              qtdmedia++;
              System.out.println(lista.get(x));
          }
      }
      System.out.println("Quantidade: " + qtdmedia);
      
      System.out.println("Números abaixo de 7:");
      for(int x = 0; x < lista.size(); x++) {
          if(lista.get(x) < 7) {
              qtd7++;
              System.out.println(lista.get(x));
          }
      }
      System.out.println("Quantidade: " + qtd7);
      
      System.out.println("====Obrigado por utilizar o programa!====");
      leia.close();
    }
}
