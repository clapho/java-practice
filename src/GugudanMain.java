import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        System.out.println("몇 단을 출력할까요?");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        int[] result = Gugudan.calculate(first, second);
        Gugudan.print(first, result);
    }
}
