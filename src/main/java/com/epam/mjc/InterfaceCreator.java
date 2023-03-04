package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return strings -> {
            for (int i = 0; i < strings.size(); i++) {
                if (!Character.isUpperCase(strings.get(i).toCharArray()[0])) {
                    return false;
                }
            };
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return integers -> {
            int length=integers.size();
            for (int i = 0; i < length; i++) {
                if(integers.get(i)%2==0){
                    integers.add(integers.get(i));
                }
            }
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        List<String>strings=new ArrayList<>();
       Supplier<List<String>>supplier = () -> {
           return strings;
       };
        for (String value : values) {
            if (Character.isUpperCase(value.charAt(0)) && value.length()>=3 && value.charAt(value.length()-1)=='.'){
               supplier.get().add(value);
            }
        }
       return supplier;
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        throw new UnsupportedOperationException("You should implement this method.");
    }
}
