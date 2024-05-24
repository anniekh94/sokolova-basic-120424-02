package lessons.lesson09;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(1, 51);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumEvenRow = 0;
        int sumOddRow = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    sumEvenRow += arr[i][j];
                } else {
                    sumOddRow += arr[i][j];
                }
            }
        }
        System.out.println("Even sum is " + sumEvenRow);
        System.out.println("Odd sum is " + sumOddRow);

        long productEvenColumn = 1;
        long productOddColumn = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0) {
                    productEvenColumn *= arr[i][j];
                } else {
                    productOddColumn *= arr[i][j];
                }
            }
        }
        System.out.println("Even product is " + productEvenColumn);
        System.out.println("Odd product is " + productOddColumn);

        int sumOfRows = 0;
        boolean areRowsMagic = true;
        for (int i = 0; i < arr.length; i++) {
            int tmpRowsSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                tmpRowsSum += arr[i][j];
            }
            if (sumOfRows == 0) {
                sumOfRows = tmpRowsSum;
            }
            if (sumOfRows != tmpRowsSum) {
                areRowsMagic = false;
                break;
            }
        }
        String rowMessage = areRowsMagic ? "Rows are magic." : "Rows aren't magic. This matrix isn't magic.";
        System.out.println(rowMessage);
        if (!areRowsMagic) {
            System.exit(0);
        }

        int sumOfColumns = 0;
        boolean areColumnsMagic = true;
        for (int i = 0; i < arr.length; i++) {
            int tmpColumnsSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                tmpColumnsSum += arr[j][i];
            }
            if (sumOfColumns == 0) {
                sumOfColumns = tmpColumnsSum;
            }
            if (sumOfColumns != tmpColumnsSum) {
                areColumnsMagic = false;
                break;
            }
        }
        String columnMessage = areColumnsMagic ? "Columns are magic." : "Columns aren't magic. This matrix isn't magic.";
        System.out.println(columnMessage);
        if (!areColumnsMagic) {
            System.exit(0);
        }

        int tmpDiagonalsSum1 = 0;
        int tmpDiagonalsSum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            tmpDiagonalsSum1 += arr[i][i];
            tmpDiagonalsSum2 += arr[i][arr.length - 1 - i];
        }
        if (tmpDiagonalsSum1 != tmpDiagonalsSum2) {
            System.out.println("Diagonals aren't magic. This matrix isn't magic.");
            System.exit(0);
        } else {
            System.out.println("Diagonals are magic.");
        }
        if (sumOfRows == sumOfColumns && sumOfColumns == tmpDiagonalsSum1) {
            System.out.println("This matrix is magic!");
        }
    }
}
