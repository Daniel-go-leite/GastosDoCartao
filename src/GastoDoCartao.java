import br.com.cartaodecredito.daniel.Compras;
import br.com.cartaodecredito.daniel.LimiteDoCArtao;

import java.util.Scanner;

public class GastoDoCartao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Limite do Cartão");
        double limite = leitura.nextDouble();
        LimiteDoCArtao cartao = new LimiteDoCArtao(limite);

        int sair =1;
        while (sair !=0){
            System.out.println("Digite o nome do produtudo:");
            String nomePro = leitura.next();

            System.out.println("Digite o valor do produto");
           double valor = leitura.nextDouble();

            Compras compras = new Compras( nomePro,valor);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair 1 para continuar");
                sair = leitura.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }

        }
              System.out.println("********************************");
              System.out.println("Compras REALIZADA:\n");

        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getNomePro() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());


    }
}