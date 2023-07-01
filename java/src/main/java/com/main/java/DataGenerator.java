package com.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DataGenerator {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Bean
    public int readIn() throws IOException {
        String fileName = "path/to/your/file.txt"; // Specify the path to your text file

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            size = Integer.parseInt(reader.readLine());
            return size;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Autowired
    public void createData(int n) {

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt(n));
        }
    }
}
