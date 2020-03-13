package com.example;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
public class TestClass {

    private String text;
    private Integer integer;

    public static void main(String[] args) {

        /*TestClass testClass = TestClass.builder()
                .integer(5)
                .text("String")
                .build();*/

        //System.out.println(testClass.getInteger());
    }
}
