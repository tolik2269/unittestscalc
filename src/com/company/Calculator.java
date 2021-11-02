package com.company;
import java.util.function.*;


public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x+y;
    BinaryOperator<Integer> minus = (x, y) -> x-y;
    BinaryOperator<Integer> multiply = (x, y) -> x*y;
    BinaryOperator<Integer> devide = (x, y) -> { // в этом фрагменте была ошибка, деление на ноль запрещено.
        if (y==0){
            System.out.println("На ноль не делим");
            return x;
        }
        return x/y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
