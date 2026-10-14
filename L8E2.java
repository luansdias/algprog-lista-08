import java.util.Scanner;
import java.util.ArrayList;

public class L8E2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<String>();
        
        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
       
        String resposta;
        int positivo = 0;
        
        
            for(int x = 0; x < 5; x++) {
            System.out.println(perguntas.get(x));
            resposta = leia.nextLine();
            
            while(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
                System.out.println("Responda sim ou nao.");
                resposta = leia.nextLine();
            }
            
            if(resposta.equalsIgnoreCase("sim")) {
                positivo++;
            }
            
            lista.add(resposta);
            }
            
            System.out.println("Quantidade de respostas positivas: " + positivo);
            
            System.out.println("====CLASSIFICAÇÃO====");
            
            if(positivo == 2) {
                System.out.println("Suspeita.");
            }
            
            else if(positivo == 3 || positivo == 4) {
                System.out.println("Cúmplice");
            }
            
            else if(positivo == 5) {
                System.out.println("Assassino");
            }
            
            else {
                System.out.println("Inocente");
            }
            
            leia.close();

    }
}
