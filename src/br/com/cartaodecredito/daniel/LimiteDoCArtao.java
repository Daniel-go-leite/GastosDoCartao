package br.com.cartaodecredito.daniel;

import java.util.ArrayList;
import java.util.List;

public class LimiteDoCArtao {

    private double limite;
    private double  Saldo;
    private List<Compras> compras;

    public LimiteDoCArtao(double limite) {
        this.limite = limite;
        this.Saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compras ){
        if (this.Saldo > compras.getValor()){
            this.Saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
             return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return Saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }


}
