package behavioral.decorator.Calculator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(3, 5);

        System.out.println("*******");

        calculator = new LoggingDecorator(calculator); //wsadzamy zmienna w konstruktor przeslonietej klasy
        calculator.add(2, 5);
        calculator.subtract(6, 4);

        System.out.println("*******");

        calculator = new StartEndDecorator(calculator);
        calculator.add(7, 3);
        calculator.subtract(9, 2);

        System.out.println("*******");

        LoggingDecorator calc = new LoggingDecorator(calculator);
        calc.add(4, 2);

        System.out.println("*******");

        StartEndDecorator calc2 = new StartEndDecorator(calculator);
        calc2.add(4, 2);

        System.out.println("*******");

        calculator = new LoggingDecorator(calculator);
        calculator = new StartEndDecorator(calculator);
        int result = calculator.add(2, 2);
    }
}
