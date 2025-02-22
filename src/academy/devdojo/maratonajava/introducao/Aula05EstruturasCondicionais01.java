package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcoolica");
        }


        if (!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcoolica");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nuva deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
