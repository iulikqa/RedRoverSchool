package JAVA_OOP_University.Natalia.Exchange;

// Класс для обмена евро в леи
class EuroToLeu extends CurrencyExchange {
    private static final double EXCHANGE_RATE = 5.00; // Примерный курс

    public EuroToLeu(double amount) {
        super(amount, "EUR");
    }

    @Override
    public double convert() {
        return amount * EXCHANGE_RATE;
    }

    @Override
    protected String getTargetCurrency() {
        return "MDL";
    }
}