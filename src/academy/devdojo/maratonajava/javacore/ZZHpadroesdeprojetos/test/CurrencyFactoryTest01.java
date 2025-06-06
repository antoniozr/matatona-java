package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.County;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(County.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
