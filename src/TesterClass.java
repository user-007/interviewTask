import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TesterClass {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = x/y;
        String toAdd = String.format("%.2f",z) ;

        list.add(toAdd);
        System.out.println(x);
        System.out.println(list.get(0));
    }
}
