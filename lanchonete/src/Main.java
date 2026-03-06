import model.Ingredientes;

public class Main {
    public static void main(String[]args) {

       Ingredientes hamburguer = new Ingredientes("pao" , "tomate" , "queijo", "bacon");

      System.out.println(hamburguer.getIngrediente1());
    }
}




