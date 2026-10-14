import java.util.Scanner;

public class L8E4 {
    public static void main(String[] args) {
      
      int[] qtd = new int[9];
      String[] faixas = {"$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599", "$600 - $699",
      "$700 - $799 ", "$800 - $899", "$900 - $999", "$1000 em diante" };
      
      double valor;
      double salario;
      
      
      Scanner leia = new Scanner(System.in);
      
      while(true) {
          System.out.println("Qual valor bruto vendido pelo funcionário?");
          System.out.println("Digite -1 se deseja encerrar.");
          valor = leia.nextDouble();
          
          if (valor == -1) {
              break;
          }
          
          salario = 200 + (valor * 0.09);
          
          if(salario >= 200 && salario < 300) {
              qtd[0]++;
          }
          
          else if(salario < 400) {
              qtd[1]++;
          }
        
          else if(salario < 500) {
              qtd[2]++;
          }
         
          else if(salario < 600) {
              qtd[3]++;
          }
          
          else if(salario < 700) {
              qtd[4]++;
          }
         
          else if(salario < 800) {
              qtd[5]++;
          }
         
          else if(salario < 900) {
              qtd[6]++;
          }
          
          else if(salario < 1000) {
              qtd[7]++;
          }
         
          else if(salario >= 1000) {
              qtd[8]++;
          }
      }
      
          for(int x = 0; x < qtd.length; x ++) {
              System.out.println("Quantidade de funcionários na faixa salarial " + faixas[x] + ": " + qtd[x] + ".");
          }
          
          leia.close();

}
}
