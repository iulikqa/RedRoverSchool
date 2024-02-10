package HW_with_Team;
import java.util.Scanner;

//•	Создайте приложение, которое принимает температуру воздуха в градусах Цельсия и выводит рекомендации:
// "Наденьте куртку", если температура ниже 10 градусов, "Наденьте свитер", если температура от 10 до 18 градусов,
// и "Наденьте футболку", если температура выше 18 градусов.
public class Task2_TemperatureAdviser {
    public static void main(String[] args) {

        System.out.println("Введите температуру в градусах Цельсия: ");

        Scanner sc = new Scanner(System.in);

        double TC = sc.nextInt();
        if (TC < 10) {
            System.out.println("Наденьте куртку");
        } else if (TC >= 10 && TC <= 18) {
            System.out.println("Наденьте свитер");
        } else {
            System.out.println("Наденьте футболку");
        }
    }

}
