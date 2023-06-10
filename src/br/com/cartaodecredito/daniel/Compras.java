package br.com.cartaodecredito.daniel;

public class Compras {

    private String nomePro;
    private double valor;


    public Compras(String nomePro, double valor) {
        this.nomePro = nomePro;
        this.valor = valor;
    }

    public String getNomePro() {
        return nomePro;
    }

    public double getValor() {
        return valor;
    }



    @Override
    public String toString() {
        return "Compras {" +  "nomePro='" + nomePro + " valor=" + valor +  '}';



    }
}
