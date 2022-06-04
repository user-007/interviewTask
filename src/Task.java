import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static List<String> getList(double amountMoney, int people){
        List<String> results = new ArrayList<>();
        Formatter formatter = new Formatter();
        double result = 0;
        if (amountMoney%people == 0) {
            result = amountMoney/people;
            for (int i = 1; i <= people; i++) {
                results.add(String.format("%.2f", result));
            }
        }
        else{
            result = Math.round(amountMoney%people);
            for (int i = 1; i <= people; i++) {
                results.add(String.format("%.2f", result));

            }
        }
        return results;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        int people = scanner.nextInt();
        List<String> result = getList(money,people);
        String joined = String.join(" ",result);
        System.out.println(joined);
    }
}
