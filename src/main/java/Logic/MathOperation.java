package Logic;

public class MathOperation {

    private double firstValue;
    private double secondValue;
    private int userChoice;


    public MathOperation(int userChoice, double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.userChoice = userChoice;
    }

    public double getSum(){
        return firstValue + secondValue;
    }
    public double getDifference(){
        return firstValue - secondValue;
    }
    private double getMultiplication(){
        return firstValue * secondValue;
    }
    private double getDivision(){
        if (secondValue == 0){
            System.out.println("Деление на ноль запрещено!");
            throw new ArithmeticException();
        }
        else return firstValue / secondValue;
    }

    public double getResult(){
        double result = 0;
        switch (userChoice){
            case 1: result = getSum(); break;
            case 2: result = getDifference(); break;
            case 3: result = getMultiplication(); break;
            case 4: result = getDivision(); break;
        }

        return result;
    }
}
