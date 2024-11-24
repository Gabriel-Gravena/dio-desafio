import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da sua agencia: ");
        int numAgencia = scanner.nextInt();
        
        System.out.println("Qual sua agencia? ");
        String agencia = scanner.next();

        System.out.println("informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numAgencia +" e seu saldo "+ saldo +" já está disponível para saque");

        scanner.close();
    }
    
}