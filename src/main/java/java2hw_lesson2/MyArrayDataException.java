package java2hw_lesson2;

public class MyArrayDataException extends IllegalArgumentException{

    int i;
    int j;

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }
}
