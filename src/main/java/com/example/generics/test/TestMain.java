package com.example.generics.test;

import com.example.generics.vo.ShowVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        ShowClass<ShowVO> objectShowClass = new ShowClass<>();
        ShowVO showVO = new ShowVO();
        showVO.setBranchNo("90905");
        showVO.setShelfNo("25252");
        ShowVO show = objectShowClass.show(showVO);
//        System.out.println(show.getBranchNo() + "===" + show.getShelfNo());

        List<ShowVO> objects = Arrays.asList(showVO);

        List<ShowVO> objects1 = returnList(objects);
        objects1.forEach(vo -> {
//            System.out.println(vo.getBranchNo());
//            System.out.println(vo.getShelfNo());
        });


        ArrayList<Person> a1 = new ArrayList<Person>();
        a1.add(new Person("abc1"));
        a1.add(new Person("abc2"));
        a1.add(new Person("abc3"));

//        printMethod(a1);


        // 下面是错误的。a2存的是Person，存在继承的话，也能放worker。但是等号右边只能存Student，存不进worker.类型安全问题。左右两边要一致
        ArrayList<Student> a2 = new ArrayList<Student>();
        a2.add(new Student("abc--1"));
        a2.add(new Student("abc--2"));
        a2.add(new Student("abc--3"));
//        printMethod(a2);

//        showKeyName(new Generic<String, Integer>("2", 1));


//        printAnymoreParams("25","22");
        printMSG(2,"25222",22L);
    }

    private static List returnList(List<?> list) {
        return list;
    }

    // 与main方法同级的静态工具类方法
    public static void printMethod(ArrayList<? extends Person> a1){
        Iterator<? extends Person> it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }


    public static <T,K> void showKeyName(Generic<T,K> container){
        System.out.println("container key :" + container.getKey());
        System.out.println("container key2 :" + container.getKey2());
        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = container.getKey();
        System.out.println(test);
//        return test;
    }

    private static void printAnymoreParams(String ... params) {
        for (String str : params) {
            System.out.println(str);
        }
    }

    private static <K> void printMSG(K ... params) {
       for (K k : params) {
           System.out.println(k);
       }
    }
}
