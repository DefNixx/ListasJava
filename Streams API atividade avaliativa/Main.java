/*Atividade Avaliativa de Programação Orientada a Objetos 
criando lista sem duplicatas em java, utilizando streams api 
@authors Nícolas André & Jefferson Eduardo */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main 
{  
    public static void main(String[] args) 
    {
        //Declaração de lista com duplicatas propositais para teste. 
        List<String> lista = new ArrayList<>();
        lista.add("As dores do mundo");
        lista.add("O mundo como vontade e representação");
        lista.add("Tractatus\n");
        lista.add("Fenomenologia do espírito");
        lista.add("Tractatus");
        lista.add("As dores do mundo");

        List<String> listaSemDuplicatas = lista.stream().distinct().collect(Collectors.toList());
        System.out.println(listaSemDuplicatas);
    }
}
