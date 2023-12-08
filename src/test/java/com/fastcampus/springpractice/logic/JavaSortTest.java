package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 리스트 반환")
    @Test
        //jUnit5~ 접근제한자를 사용하지 않음
    void given_List_WhenExecutin_ThenReturnSortedList(){

        //  Given
        JavaSort<Integer> javaSrot = new JavaSort<>();

        //  When
        List<Integer> actual = javaSrot.sort(List.of(3,5,6,8,1));

        //  Then
        assertEquals(List.of(1,3,5,6,8), actual);

    }


}