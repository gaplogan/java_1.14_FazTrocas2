import java.util.Scanner;

public class FazTrocas2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2;

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        //valida os n�meros para garantir que sejam diferentes entre si
        do
        {
            System.out.print("Digite o primeiro n�mero: ");
            n1 = entrada.nextDouble();
            System.out.print("Digite o segundo n�mero: ");
            n2 = entrada.nextDouble();
        } while (n1 == n2); //fim a entrada/valida��o dos n�meros

        System.out.println();
        System.out.println("Valores antes das trocas: ");
        System.out.println("Primeiro n�mero: " + n1);
        System.out.println("Segundo n�mero: " + n2);
        
        //{Faz as trocas com adi��es e subtra��es}
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        
        //{Apresenta os resultados}         
        System.out.println();
        System.out.println("Valores depois das trocas: ");
        System.out.println("Primeiro n�mero: " + n1);
        System.out.println("Segundo n�mero: " + n2);

        entrada.close();
    }
}
