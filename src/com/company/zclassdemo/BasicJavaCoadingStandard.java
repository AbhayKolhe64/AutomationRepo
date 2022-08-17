package com.company.zclassdemo;

import java.util.ArrayList;
import java.util.List;

public class BasicJavaCoadingStandard {

    public static void main(String[] args) {

        Set hashSet = new HashSet();
        hashSet.add("Pune");
        hashSet.add("Mumbai");
        hashSet.add("Hinjevadi");
        hashSet.add("Pune");
        hashSet.add("Vakad");
        hashSet.add(null);

        System.out.println(hashSet.add("Vakad"));
        hashSet.add(null);

        for(Object o : hashSet){
            System.out.println(o);
        }





    }
}
