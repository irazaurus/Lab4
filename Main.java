import objects.*;
import persons.*;
import others.*;

/**
 * Когда лодка врезалась в камыши под деревьями, на небе взошла полная луна.
 * Он немного подождал, но поскольку Снусмумрик ничего больше не добавил,
 * Муми-тролль вылез из лодки и зашагал берегом назад.
 * Снусмумрик сел на корму и осторожно выбил пепел из трубки, он наклонился и выглянул из-за камышей.
 * Хемуль уверенно держал курс вперед. Он был отчетливо виден на лунной дорожке.
 * Снусмумрик тихонько рассмеялся и начал набивать свою трубку.
 **/


public class Main {

    public static void main(String[] args) {

            //создаем персонажей
        Persons Snufkin = new Persons("Снусмумрик");
        Persons MoomyTroll = new Persons("Муми-тролль");
        Persons Hemul = new Persons("Хемуль");
            //создаем места
        Place Coast = new Place("Берег");
        Place OnSky = new Place("На небе");
        Place MoonPath = new Place("Лунная дорожка");
        Place UnderTrees = new Place("Под деревьями");
            //создаем объекты
        Objects Boat = new Objects("Лодка", Coast);
        Objects Moon = new Objects("Полная луна", OnSky);
        Objects Stern = new Objects("Корма");
        Objects Ash = new Objects("Пепел");
        Objects Pipe = new Objects("Трубка");
        Objects Canes = new Objects("Камыши", UnderTrees);

        //лямбда-выражение, возвращает " но "
        Text textBut;
        textBut = () -> ", но ";

        //лямбда-выражение, возвращает точку
        Text textDot;
        textDot = () -> ".";

        //лямбда-выражение, возвращает запятую
        Text textComma;
        textComma = () -> ", ";

        //лямбда-выражение, возвращает " и "
        Text textAnd;
        textAnd = () -> " и ";


        System.out.print(Boat.WhenBump(Canes) + textComma.addText());
        System.out.println(Moon.Rise() + textDot.addText());
        System.out.print(MoomyTroll.waitForAWhile() + textBut.addText() + Snufkin.addNothing() + textComma.addText() + MoomyTroll.getOut(Boat));
        System.out.println(textAnd.addText() + MoomyTroll.walk() + textDot.addText());
        System.out.print(Snufkin.sitOn(Stern) + textAnd.addText());
            Snufkin.setFeel(Feeling.CAREFUL);
        System.out.print(Snufkin.strike(Ash, Pipe) + textComma.addText());
        System.out.println(Snufkin.lean() + textAnd.addText() + Snufkin.lookOut(Canes) + textDot.addText());
            Hemul.setFeel(Feeling.CONFIDENT);
        System.out.println(Hemul.cape() + textDot.addText());
        System.out.println(Hemul.beSeen(MoonPath) + textDot.addText());
            Snufkin.setFeel(Feeling.CALM);
        System.out.println(Snufkin.laugh() + textAnd.addText() +Snufkin.startedFilling(Pipe) + textDot.addText());

        Ash ash = new Ash("Пепел");
        ash.put();
        ash.smoke(Snufkin);
    }
}