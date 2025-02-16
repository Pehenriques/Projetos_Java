import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        Scanner sc = new Scanner(System.in);    
        numeroConta = sc.nextInt();
    
        System.out.println("Digite a agência: ");
        sc.nextLine();
        agencia = sc.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();    

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência e " + agencia + ", conta " + numeroConta+ " e seu saldo R$ " + saldo +" ja está disponível para saque");
    

        
    }
}
