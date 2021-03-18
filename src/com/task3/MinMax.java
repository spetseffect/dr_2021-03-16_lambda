package com.task3;

public class MinMax<T extends Number> {
    public T[] arr;

    public MinMax(T... arr) {
        this.arr = arr;
    }

    public T searchMin() throws Exception {
        if (arr.length > 0) {
            var result = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (result.doubleValue() > arr[i].doubleValue()) result = arr[i];
            }
            return result;
        } else throw new Exception("Error. Array is empty.");
    }

    public T searchMax() throws Exception {
        if (arr.length > 0) {
            var result = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (result.doubleValue() < arr[i].doubleValue()) result = arr[i];
            }
            return result;
        } else throw new Exception("Error. Array is empty.");
    }
}
