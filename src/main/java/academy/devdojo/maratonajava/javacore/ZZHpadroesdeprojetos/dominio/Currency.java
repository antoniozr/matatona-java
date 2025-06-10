package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}
class UsDollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
class Euro implements Currency{
    @Override
    public String getSymbol() {
        return "€";
    }
}
