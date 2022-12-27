package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (list) -> {
            List<Integer> listNew = new ArrayList<>();
            for (Integer integer : list) {
                listNew.add(integer / divider);
            }
          return listNew;
        };
    }
}
