package com.github.rebeccamoraes.ufg.cs.aula08.application.console;
import com.github.rebeccamoraes.ufg.cs.aula08.domain.AnalisadorArquivo;
public class ProgramaInteiro {
    public static void main(String[] args){
        System.out.println("teste");
        try {
            //Scanner leitor = new Scanner(System.in);
            //String nomeArquivo = leitor.nextLine();
            String resultado = AnalisadorArquivo.prefixoHexadecimal2("Teste.class");
            System.out.print(resultado);
        }catch (Exception e){
            System.out.print("excecao");
            System.out.println(e.getMessage());
        }
    }
}
