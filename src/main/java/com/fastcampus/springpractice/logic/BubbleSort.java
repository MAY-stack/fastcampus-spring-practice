package com.fastcampus.springpractice.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> {

    public List<T> sort(List<T> input){
        List<T> output = new ArrayList<>(input);

        for (int i = output.size() -1; i > 0; i--){
            for(int k = 0; k < i; k++){
                if (output.get(k).compareTo(output.get(k + 1)) > 0){
                    T temp = output.get(k);
                    output.set(k, output.get(k + 1));
                    output.set(k +1, temp);
                }
            }

        }

        return output;
    }
}
