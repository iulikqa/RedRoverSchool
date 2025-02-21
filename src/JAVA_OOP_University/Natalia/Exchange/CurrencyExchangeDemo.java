package JAVA_OOP_University.Natalia.Exchange;

// Основной класс для демонстрации работы
public class CurrencyExchangeDemo {
    public static void main(String[] args) {
        // Полиморфизм: обработка разных типов обмена через общий класс
        CurrencyExchange exchange1 = new LeuToEuro(100);
        CurrencyExchange exchange2 = new EuroToLeu(20);

        exchange1.displayResult();
        exchange2.displayResult();
    }
}