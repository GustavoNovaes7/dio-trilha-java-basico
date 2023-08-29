import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in, "latin1");
        int numeroConta;
        String numeroAgencia, nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o seu Nome Completo!");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        numeroAgencia = entrada.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        saldo = entrada.nextDouble();

        entrada.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo de R$"+saldo+" já está disponível para saque.");
    }
}
