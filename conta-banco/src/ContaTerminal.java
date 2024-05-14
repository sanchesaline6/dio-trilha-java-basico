import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência!");
        Scanner sc = new Scanner(System.in);
        agencia = sc.nextLine();
        numero = sc.nextInt();
        nomeCliente = sc.nextLine();
        saldo = sc.nextDouble();

        System.out.print("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
