import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.print("Qual é o seu nome? ");
        nomeCliente = sc.nextLine();

        System.out.print("Agora, nos informe o número da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Por fim, nos informe seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
