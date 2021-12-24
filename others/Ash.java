package others;
import objects.*;
import persons.Persons;

import java.util.Scanner;

public class Ash extends Objects {
    private int number = 0;

    public Ash(String name) {
        super(name);
    }

    public class PipeException extends Exception {
    }

    public void put() {
        System.out.println('\n' + "Сколько грамм пепла положить в трубку?");
        Scanner scanner = new Scanner(System.in);

        try {
            int x = Integer.parseInt(scanner.next());
            if (x == 0) {
                System.out.println("Трубка осталась пустой.");
            } else if (x < 0) {
                try {
                    throw new PipeException();
                } catch (PipeException exception) {
                    System.out.println("Граммы не могут быть отрицательными.");
                    this.put();
                }
            } else if (x > 50) {
                try {
                    throw new PipeException();
                } catch (PipeException exception) {
                    System.out.println("В трубке не может столько поместиться!");
                    this.put();
                }
            } else {
                number = x;
                System.out.println("В трубке стало " + number + " грамм пепла.");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Введите число.");
            this.put();
        }
    }


    public class NoAshException extends RuntimeException {
        public NoAshException(String message) {
            super(message);
        }
    }

    public void smoke(Persons persons) {
        if (number == 0) {

        System.out.println('\n' + "Но все-таки хочется закурить. Сколько положем пепла?");
        Scanner scanner = new Scanner(System.in);
        String y = scanner.next();

        try {
            if (y.equals(0)) {
                throw new NoAshException("Сегодня день табака, закурить обязательно!");
            } else {
                for (int i = 0; i < y.length(); i++) {
                    if ((y.charAt(i) >= 'a' && y.charAt(i) <= 'z') || (y.charAt(i) >= 'A' && y.charAt(i) <= 'Z') || (y.charAt(i) >= 'а' && y.charAt(i) <= 'я') || (y.charAt(i) >= 'А' && y.charAt(i) <= 'Я')) {
                        throw new NoAshException("Ответ не должен содержать буквы.");
                    } else {
                        System.out.println(persons.getName() + " затянулся.");
                    }
                }
            }
        } catch (NoAshException exception) {
            System.out.println(exception.getMessage());
        }
    }
        else {
            System.out.println(persons.getName() + " смачно закурил.");
        }
    }
}