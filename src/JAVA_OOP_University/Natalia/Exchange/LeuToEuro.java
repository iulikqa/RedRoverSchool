package JAVA_OOP_University.Natalia.Exchange;

// Класс для обмена леев в евро
class LeuToEuro extends CurrencyExchange {
    private static final double EXCHANGE_RATE = 0.20; // Примерный курс

    public LeuToEuro(double amount) {
        super(amount, "MDL");
    }

    @Override
    public double convert() {
        return amount * EXCHANGE_RATE;
    }

    @Override
    protected String getTargetCurrency() {
        return "EUR";
    }
}
