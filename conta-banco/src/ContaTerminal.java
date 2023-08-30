import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero = 1021;
        String agencia = "067-8"; 
        String nomeCliente = "Mario Andrade";
        Double saldo = 237.48;   

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        numero = scanner.nextInt();

        if(numero == 1021) {
            System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " +
            agencia + " conta " + numero + " e seu saldo de R$ " + saldo + 
            " já está disponível para saque.");
        } else {
            System.out.println("Número incorreto, tente novamente!");
        }

        /*achei estranho pedir para o usuário digitar o número da agência
        e a resposta do usário se 1021, mas não consegui fazer o if funcionar
        com a resposta 067-8*/    
              
    }
}
