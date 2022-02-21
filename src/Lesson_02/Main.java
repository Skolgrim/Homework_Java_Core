package Lesson_02;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"6", "3", "4", "3"},
                {"1", "4", "8", "0"},
                {"8", "9", "3", "7"},
                {"5", "0", "6", "4"}
        };
        String[][] arrErrorSize = {
                {"1", "8", "3", "0"},
                {"1", "4", "8", "0"},
                {"5", "0", "6", "4"}
        };
        String[][] arrErrorData = {
                {"1", "4", "8", "0"},
                {"6", "3", "9", "3"},
                {"6", "lorem", "4", "3"},
                {"5", "0", "6", "4"}
        };

        try {
            System.out.println("Сумма: " + myMethod(arr));
            System.out.println("Сумма: " + myMethod(arrErrorSize));
            System.out.println("Сумма: " + myMethod(arrErrorData));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static int myMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк в массиве");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов в массиве");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}