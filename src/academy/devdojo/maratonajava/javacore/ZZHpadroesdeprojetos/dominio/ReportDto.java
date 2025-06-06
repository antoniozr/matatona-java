package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio;

public class ReportDto {
    private String aircraftName;
    private County county;
    private Currency currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private County county;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder county(County county) {
            this.county = county;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.personName = this.personName;
            reportDto.county = this.county;
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            return reportDto;
        }

        @Override
        public String toString() {
            return "ReportDtoBuilder{" +
                    "aircraftName='" + aircraftName + '\'' +
                    ", county=" + county +
                    ", currency=" + currency +
                    ", personName='" + personName + '\'' +
                    '}';
        }
    }
}
