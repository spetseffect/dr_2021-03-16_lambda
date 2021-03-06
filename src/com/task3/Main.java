package com.task3;

public class Main {
    public static void main(String[] args) throws Exception {
        var mm = new MinMax<Integer>(1, 2, 3, 4, 5);
        IMinMax<Integer> min = mm::searchMin;
        IMinMax<Integer> max = mm::searchMax;
        System.out.println("Минимальное значение в массиве: "+min.search());
        System.out.println("Максимальное значение в массиве: "+max.search());
    }

}
