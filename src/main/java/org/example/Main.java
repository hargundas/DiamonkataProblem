package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DiamondPrinter printer = new DiamondPrinter();
        List<String> diamond = printer.printToList('Z');
        for (String row : diamond) {
            System.out.println(row);
        }
    }
}