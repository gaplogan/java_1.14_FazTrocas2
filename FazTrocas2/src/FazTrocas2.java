import java.util.Scanner;

public class FazTrocas2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2;

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        //valida os números para garantir que sejam diferentes entre si
        do
        {
            System.out.print("Digite o primeiro número: ");
            n1 = entrada.nextDouble();
            System.out.print("Digite o segundo número: ");
            n2 = entrada.nextDouble();
        } while (n1 == n2); //fim a entrada/validação dos números

        System.out.println();
        System.out.println("Valores antes das trocas: ");
        System.out.println("Primeiro número: " + n1);
        System.out.println("Segundo número: " + n2);
        
        //{Faz as trocas com adições e subtrações}
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        
        //{Apresenta os resultados}         
        System.out.println();
        System.out.println("Valores depois das trocas: ");
        System.out.println("Primeiro número: " + n1);
        System.out.println("Segundo número: " + n2);

        entrada.close();
    }
}
