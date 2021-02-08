package java2hw_lesson2;

public class MyArraySizeException extends IndexOutOfBoundsException {


    public int getNumber() {
        return number;
    }

    private int number;
    public MyArraySizeException(int number) {
        this.number = number;
    }
    public MyArraySizeException(String s, int number) {
        super(s);
        this.number = number;
    }
}
