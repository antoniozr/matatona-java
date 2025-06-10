package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        County county = County.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(county);
        Person person = Person.PersonBuilder.
                builder().
                firstName("Antonio").
                lastName("Junior").
                build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .county(county)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);

    }
}
