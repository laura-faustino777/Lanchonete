package model;

import java.util.ArrayList;

public class Hamburguer {
    private ArrayList<String> ingredientes;

    public Hamburguer(ArrayList<String> ingredientes, double preco) {
        this.ingredientes = ingredientes;
        Preco = preco;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    //preço do hamburguer
    double Preco;

    public Hamburguer(ArrayList<String> ingredientes){
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes(){
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

}



