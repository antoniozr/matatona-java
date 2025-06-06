package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(County county){
        switch (county){
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            case EUROPE:
                return new Euro();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
