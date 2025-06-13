import java.util.Scanner;
public class ContaTerminal {
    private int numeroConta;
    private String agencia; 
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = criarContaTerminal();
        conta.exibirDetalhesConta();
    }
    public static ContaTerminal criarContaTerminal() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal();
        conta.numeroConta = numeroConta;
        conta.agencia = agencia;
        conta.nomeCliente = nomeCliente;
        conta.saldo = saldo;

        scanner.close();
        return conta;
    }

    public void exibirDetalhesConta() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + numeroConta);
        System.out.printf("E seu saldo: R$ %.2f%n", saldo);
    }
}