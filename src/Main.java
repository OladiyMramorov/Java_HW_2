import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 4] : ");
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                FirstTask firstTask = new FirstTask();
                firstTask.SqlQuerry();
                break;
            case 2:
                SecondTask secondTask = new SecondTask();
                secondTask.setArr();
                secondTask.getArr();
                secondTask.bubbleSort();
                break;
            case 3:
                ThirdTask thirdTask = new ThirdTask();
                thirdTask.parseJson();
                break;
            case 4:
                FourthTask fourthTask = new FourthTask();
                fourthTask.Calculator();
                break;
            default:
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}