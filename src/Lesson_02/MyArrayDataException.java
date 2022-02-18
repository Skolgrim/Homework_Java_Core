package Lesson_02;

public class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        System.out.println("Неверный тип данных в строке: " + row + " стобце: "  + col);
    }
}

