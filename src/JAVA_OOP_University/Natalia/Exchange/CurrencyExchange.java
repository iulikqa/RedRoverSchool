package JAVA_OOP_University.Natalia.Exchange;

// Абстрактный класс для обмена валют
abstract class CurrencyExchange implements Convertible {
    protected double amount;
    protected String currency;

    public CurrencyExchange(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Абстрактный метод конвертации валюты
    public abstract double convert();

    public void displayResult() {
        System.out.println("Сумма после конвертации: " + convert() + " " + getTargetCurrency());
    }

    protected abstract String getTargetCurrency();
}