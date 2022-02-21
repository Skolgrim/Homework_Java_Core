package Lesson_02;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String messageError) {
        System.out.println(messageError);
    }
}