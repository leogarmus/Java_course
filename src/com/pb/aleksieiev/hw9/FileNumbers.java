package com.pb.aleksieiev.hw9;

import java.io.*;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) {
        createNumberFile();
        createOddNumbersFile();

    }

    static void createNumberFile() {
        Random random = new Random();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int x = random.nextInt(100);
                numbers.append(x);
                if (j != 9) {
                    numbers.append(" ");
                }
            }
            numbers.append("\n");
        }

        try (FileWriter writer = new FileWriter("numbers.txt", false)) {
            writer.write(numbers.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createOddNumbersFile() {

        try (InputStream is = new FileInputStream("numbers.txt")) {
            int available = is.available();
            byte[] buffer = new byte[available];

            int i = 0;

            int data = is.read();
            while (data != -1) {
                buffer[i] = (byte) data;
                data = is.read();
                i++;
            }
            String numbers = new String(buffer);
            StringBuilder oddNumbers = new StringBuilder();
            String[] lines = numbers.split("\n");
            for (String line : lines) {
                String[] symbols = line.split(" ");
                for (int k = 0; k < symbols.length; k++) {
                    try {
                        Integer.parseInt(symbols[k]);
                        int x = Integer.parseInt(symbols[k]);
                        if (x % 2 == 0) {
                            x = 0;
                        }
                        oddNumbers.append(x);
                        if (k != symbols.length - 1) {
                            oddNumbers.append(" ");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                oddNumbers.append("\n");
            }
            try (FileWriter writer = new FileWriter("odd-numbers.txt", false)) {
                writer.write(oddNumbers.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
