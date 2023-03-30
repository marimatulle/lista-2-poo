4. Modifique a classe Conta para fornecer um método chamado debitar que retira 
dinheiro de uma Conta. Assegure que a quantidade de débito não exceda o saldo de Conta. 
Se exceder, o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que 
indica “Quantia de débito excedeu o saldo da conta”. 
Modifique a classe UsaConta para testar o método debitar.

**Classe Conta com um construtor para validar e inicializar o atributo saldo**
```
public class Conta {
    private double saldo;

    public Conta (double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo = 0.0;
        }

    public double getSaldo() {
        return saldo;
    }

    public void creditar (double quantia) {
        saldo += quantia;
    }
    //insira aqui o método debitar
}
```
**Classe UsaConta – Entrada e saída de números de ponto flutuante com objetos da classe Conta**
```
import java.util.*;
public class UsaConta
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta (1000.00);
        Conta conta2 = new Conta (150.00);

        /* exibe o saldo inicial de cada objeto */
        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());

        System.out.print("Digite o valor de retirada da conta1: ");
        double qtdeRetirada1 = scanner.nextDouble(); // quantidade retirada lida a partir do usuario
        
        // apresenta a quantidade retirada
        System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", qtdeRetirada1);

        /* insira aqui a chamada ao método debitar do objeto conta1 enviando como parâmetro qtdeRetirada1*/

        //exibe os saldos
        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());

        System.out.print("Digite o valor de retirada da conta2: ");
        double qtdeRetirada2 = scanner.nextDouble();

        // apresenta a quantidade retirada
        System.out.printf("Subtraindo %.2f do saldo da conta1\n\n", qtdeRetirada2);

        /* insira aqui a chamada ao método debito do objeto conta2 enviando como parâmetro qtdeRetirada2*/

        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());
    }
}
```


