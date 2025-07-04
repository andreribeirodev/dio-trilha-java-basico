import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Número da Conta:");
        int conta = sc.nextInt();
        System.out.println("Digite o Número da Agência:");
        String agencia = sc.next();
        System.out.println("Digite o Nome do Cliente:");
        String nomeCliente = sc.next();
        System.out.println("Digite o Valor do Deposito inicial:");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo é de " + saldo + " e já está disponível para saque.");
    }
}
