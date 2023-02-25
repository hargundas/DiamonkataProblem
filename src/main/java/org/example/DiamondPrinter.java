package org.example;

import java.util.ArrayList;
import java.util.List;

public class DiamondPrinter {
    public List<String> printToList(char a) {
        int diamondSize = (int) a - (int) 'A' + 1;
        List<String> diamond = new ArrayList<>();

        // build the upper half of the diamond
        for (int i = 0; i < diamondSize; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < diamondSize - i - 1; j++) {
                row.append(" ");
            }
            row.append((char) ('A' + i));

            for (int j = 0; j < 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    row.append(" ");
                } else {
                    char c = (char) ('A' + i);
                    if (c != 'A' && c != 'B') {
                        row.append(" ");
                    } else {
                        row.append(c);
                    }
                }
            }
            if (i > 0) {
                row.append((char) ('A' + i));
            }
            for (int j = 0; j < diamondSize - i - 1; j++) {
                row.append(" ");
            }
            diamond.add(row.toString());
        }

        // build the lower half of the diamond by copying the upper half in reverse order
        for (int i = diamondSize - 2; i >= 0; i--) {
            diamond.add(diamond.get(i));
        }

        return diamond;
    }
 }