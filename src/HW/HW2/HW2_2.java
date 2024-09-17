package HW.HW2;

public class HW2_2 {
    public static void main(String[] args) {

        //Задача №2
        //Создать программу дележа добычи на пиратском корабле. По обычаю,
        //половина добычи идет владельцу корабля, половина оставшегося — капитану,
        //остальное делится поровну между всеми членами команды, включая капитана.

        //  ----------- ДАНО -----------
        int pirates = 45;
        int loot = 1745;

        //    -----------

        //    Вываливаем всё золото на палубу для дальнейшего деления
        int remaining = loot;

        //    Отложили долю владельца корабля
        int ownerShare = remaining / 2;
        remaining = remaining - ownerShare;

        //    Отложили долю апитана
        int capitanShare = remaining / 2;
        remaining = remaining - capitanShare;

        //    Разделим оставшееся поровну
        int eachPirateShare = remaining / (pirates + 1);
        capitanShare = capitanShare + eachPirateShare;
        remaining =  remaining - eachPirateShare * (pirates + 1);

        //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        //Вывести на экран кому сколько пиастров полагается
        //Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        System.out.println("Владельцу: " + ownerShare);
        System.out.println("Капитану: " + capitanShare);
        System.out.println("Каждому члену команды: " + eachPirateShare);
        System.out.println("Остаток на пропой: " + remaining);

        //Попробовать придумать как программа может проверить правильность дележа.
        System.out.println(ownerShare + capitanShare + eachPirateShare * pirates + remaining);
    }
}
