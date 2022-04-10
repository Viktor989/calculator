package Company;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
    Calculator calc= Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);//алгоритм не учитывает что b может равняться 0

        if (c != 0) {
            calc.println.accept(c);
        } else {
            System.out.println("На ноль делить нельзя");
        }






    }
}
