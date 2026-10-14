import java.util.Scanner;
import java.util.ArrayList;

public class Temperatura {
    
    String[] nomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
    "Setembro", "Outubro", "Novembro", "Dezembro" };
    
    String nome;
    double mediaMes;
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        ArrayList<Temperatura> lista = new ArrayList<>();
        
        double soma = 0;
        double mediaAnual;
        
        for(int x = 0; x <12; x++) {
            Temperatura mes = new Temperatura();
            
            mes.nome = mes.nomes[x];
            
            System.out.println("Digite a temperatura de " + mes.nome + ":");
            mes.mediaMes = leia.nextDouble();
            
            soma += mes.mediaMes;
            
            lista.add(mes);
        }
        
        mediaAnual = soma / 12;
        System.out.println("MÉDIA ANUAL: " + mediaAnual);
        System.out.println("====TEMPERATURAS ACIMA DA MÉDIA====");
        
        
          for(int x = 0; x < lista.size(); x++) {
              if (lista.get(x).mediaMes > mediaAnual) {
                  System.out.println(lista.get(x).mediaMes + " ocorreu em " + lista.get(x).nome + ".");
              }
          }
          
          leia.close();
    }
}
