package MainPackage;

import Logic.DataEntry;
import Logic.MathOperation;

import java.math.BigDecimal;

public class UserInterface {

    public void printResult(){
        System.out.println("Список доступных операций: \n1) Сложение \n2) Вычитание \n3) Умножение \n4) Деление\nВведите номер выбраной операции:");
        DataEntry dataEntry = new DataEntry();
        dataEntry.setValue();
        MathOperation choiceOperation = new MathOperation(dataEntry.getUserChoice(), dataEntry.getFirstValue(), dataEntry.getSecondValue());
        double result = choiceOperation.getResult();
        System.out.println(result);
        if (BigDecimal.valueOf(result).scale() >= 4) System.out.printf("Результат: %.4f", choiceOperation.getResult());
        else if (BigDecimal.valueOf(result).scale() == 3) System.out.printf("Результат: %.3f", choiceOperation.getResult());
        else if (BigDecimal.valueOf(result).scale() == 2) System.out.printf("Результат: %.2f", choiceOperation.getResult());
        else if (BigDecimal.valueOf(result).scale() == 1) System.out.printf("Результат: %.1f", choiceOperation.getResult());
        else if (BigDecimal.valueOf(result).scale() == 0) System.out.printf("Результат: %.0f", choiceOperation.getResult());

    }


}
