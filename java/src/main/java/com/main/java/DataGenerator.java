package com.main.java;

import java.util.Random;

public class DataGenerator {
    public void createData(int size) {

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            System.out.println(random.nextInt(size));
        }
    }
}
