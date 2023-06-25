package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        String numberOfDays;
        switch (month){
            case (2):
                numberOfDays="28";
                break;
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                numberOfDays="31";
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                numberOfDays="30";
                break;
            default: numberOfDays="wrong number!";
            break;
        }
        System.out.println(numberOfDays);
    }
}
