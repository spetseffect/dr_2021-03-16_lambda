package com.task4;


import java.util.function.Predicate;

public class Main {
    static <T extends Number> T sum(T[] args, Predicate<T> pred) {
        double result = 0.0;
        for (T i : args)
            if (pred.test(i)) result += i.doubleValue();
        return (T) Double.valueOf(result);
    }

    public static void main(String[] args) {
        Integer eq = -1;
        int a = -5, b = 5;
        Predicate<Integer> isEquals = eq::equals;
        Predicate<Integer> interval = x -> x < a || x > b;
        Predicate<Integer> moreZero = x -> x > 0;
        Predicate<Integer> lessZero = x -> x < 0;
        var arr = new Integer[]{7, -5, 8, -9, 2, -1, 5, -7, 8, -1, 3, -8, 9, 0, -8, 4, -6, 5, -7, 8, -6, 2, -3, 7, -4, 8, -8, 1, -7, 8, -1, 6, -7, 6, 0};
        System.out.println(eq+" == x → "+sum(arr, isEquals));
        System.out.println("a > x < b → "+sum(arr, interval));
        System.out.println("x > 0 → "+sum(arr, moreZero));
        System.out.println("x < 0 → "+sum(arr, lessZero));
    }
}
