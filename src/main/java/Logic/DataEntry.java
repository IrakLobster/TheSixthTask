package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntry {

    private Scanner scanner;
    private int userChoice;
    private double firstValue;
    private double secondValue;

    public DataEntry(){
        scanner = new Scanner(System.in);
    }

    public void setValue(){
        userChoice = scanner.nextInt();
        if (userChoice < 1 || userChoice > 4){
            System.out.println("Вы ввели неверную операцию!");
            throw new IllegalArgumentException();
        }
        try{
            System.out.println("Введите первое число: ");
            firstValue = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            secondValue = scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.println("Вы ввели неверное значение!");
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public int getUserChoice() {
        return userChoice;
    }
}
