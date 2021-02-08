package java2hw_lesson2;

public class Main {
    public static void main(String[] args) {
        String [][] table= {
                {"2","3","4","5"},
                {"5","3","4","5"},
                {"2","8","8","8"},
                //{"2","8","8","8"},
                {"3","9","4","9"}
        };
        try{
        arrayCount(table);}
        catch (MyArraySizeException|MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }



    public static void arrayCount(String [][] table) throws MyArraySizeException, MyArrayDataException {
        int n=4;
        int i;
        int j;


        if (table.length!=n || table[0].length!=n ||table[1].length!=n || table[2].length!=n ||table[3].length!=n) {
            throw new MyArraySizeException("Размер строк и столбцов массива должен быть равен "+n,n);
        }
        System.out.println("Наш массив 4х4");
        int count=0;
        for (i=0; i<table.length; i++){
            for (j=0;j<table[i].length;j++) {
                System.out.print(table[i][j]+" ");
            }

            System.out.println();
        }
            for (i=0; i<table.length; i++){
                for (j=0;j<table[i].length;j++) {

                    try{
                    count+=Integer.parseInt(table[i][j]);}
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException("Формат данных ячейки i=" + (i+1)+", j=" +(j+1) +" неверен",(i+1),(j+1));
                    }
                }

        }
            System.out.println("Сумма элементов массива = "+ count);


    }
}
