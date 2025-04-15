import java.util.Scanner;
public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao terminal!");
        System.out.println("Vamos criar sua conta do banco, para isso, siga o seguinte passo a passo:");
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Agora, sua agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Número da conta");
        int numero = scanner.nextInt();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + String.format("R$ %.2f", saldo)
                + " já está disponível para saque.");

        scanner.close();
        /*
         * 1. Abra o CMD
         *
         * 2. Navegue até a pasta onde está o projeto compilado:
         *
         *    Exemplo:
         *
         *    C:\> cd Users\SeuUsuario\Desktop\NomeDaPastaDoProjeto
         *    C:\Users\SeuUsuario\Desktop\NomeDaPastaDoProjeto> cd out
         *    C:\Users\SeuUsuario\Desktop\NomeDaPastaDoProjeto\out> cd production
         *    C:\Users\SeuUsuario\Desktop\NomeDaPastaDoProjeto\out\production> cd ContaBanco
         *    C:\Users\SeuUsuario\Desktop\NomeDaPastaDoProjeto\out\production\ContaBanco> java ContaTerminal
         * */


    }
}