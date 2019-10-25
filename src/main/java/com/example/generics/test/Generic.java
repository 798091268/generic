package com.example.generics.test;

public class Generic<T,K>{
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;
    private K key2;

    public Generic(T key,K key2) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
        this.key2 = key2;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public K getKey2() {
        return key2;
    }
}