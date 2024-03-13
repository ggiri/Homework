package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee(101, "Test1");
        Employee e2 = new Employee(102, "Test2");
        Employee e3 = new Employee(103, "Test3");
        Employee e4 = new Employee(104, "Test4");
        Employee e5 = new Employee(104, "Test5");

        System.out.println(e1.hashCode());
        System.out.println(e1);
        System.out.println(e2);
        e1=e2;
        System.out.println(e2.hashCode());
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e5.hashCode());
        map.put(e1,"test1");
        map.put(e2,"test2");
        map.put(e3,"test3");
        map.put(e4,"test4");
        map.put(e5,"test5");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(e5));
        System.out.println(map.get(e4));


    }
}
