package org.example.HW_3;

public class Less {
    // Второй пример рекурсии в Java

        int[] values;
    Less(int i) {
            values = new int[i];
        }

        // вывести рекурсивно элементы массива
        void printArray(int i) {

            if(i <= 0) {
                return;
            } else {
                printArray(i - 1);
                System.out.println("[" + (i - 1) + "] " + values[i - 1]);
            }
        }
    }

    class RecursionMain {
        private static final int num = 23;

        public static void main(String[] args) {
            Less rec = new Less(num);
            int j;
            for(j = 0; j < num; j++) {
                rec.values[j] = j;
            }
            rec.printArray(num);
        }
    }

