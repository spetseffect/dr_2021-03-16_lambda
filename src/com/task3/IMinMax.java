package com.task3;

@FunctionalInterface
public interface IMinMax<T extends Number>{
    public T search() throws Exception;
}
