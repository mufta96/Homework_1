import java.util.*;

public class Homework_2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1.\n" +
                "        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\n" +
                "        С помощью цикла и условия заменить 0 на 1, 1 на 0\n");

        byte[] inverse = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        String inverseinp = Arrays.toString(inverse);
        System.out.println(inverseinp);
        for (int i = 0; i < 10; i++) {
            switch (inverse[i]) {
                case 1:
                    inverse[i] = 0;
                    break;
                case 0:
                    inverse[i] = 1;
                    break;
            }
        }
        String inverseoutp = Arrays.toString(inverse);
        System.out.println(inverseoutp + '\n');
        /*
        2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        byte[] filler = new byte[8];
        for (int i = 0; i < 8; i++) {
            filler[i] = (byte) (i * 3);
        }
        String filleroutp = Arrays.toString(filler);
        System.out.println("2. Задать пустой целочисленный массив размером 8. \n" +
                "        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;\n"
                + '\n' + filleroutp + '\n');
        /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
         и числа меньшие 6 умножить на 2;
         */
        byte[] lessix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (byte i = 0; i < 12; i++) {
            if (lessix[i] < 6) {
                lessix[i] = (byte) (lessix[i] * 2);
            }
        }
        String lessoutp = Arrays.toString(lessix);
        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,\n" +
                "         и числа меньшие 6 умножить на 2;\n\n" +
                lessoutp + '\n');
        /*
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        System.out.println("Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n" +
                "         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;\n");
        int matrixSize = 0;
        //boolean scancheck = false;
                    System.out.println("Введите порядок матрицы\n");
            try{
                matrixSize=in.nextInt();
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Это не число");
            }



                System.out.println();

        int[][] table = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                table[i][j] = 0;
                if (j == i)
                    table[i][j] = 1;
                if (i ==  matrixSize-1-j)
                    table[i][j] = 1;
                System.out.print(" " + table[i][j]);
            }
            System.out.println();
        }
/*
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
 */
        byte[] minmax = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};
        byte min=minmax[0], max=minmax[0];
        for (int i = 1; i < 12; i++){
            if (minmax[i]>max)
                max=minmax[i];
            if (minmax[i]<min)
                min=minmax[i];
        }
        System.out.println("Задать одномерный массив и найти в нем минимальный\n и максимальный элемен)ты (без помощи интернета);\n");
        String minmaxoutp = Arrays.toString(minmax);
        System.out.println(minmaxoutp + "\n Минимальный элемент " + min + "\n Mаксимальный элемент " + max);
        /*
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
          части массива равны.

          Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1])
          → true, граница показана символами ||, эти символы в массив не входят.
         */
       System.out.println(mirror());
       /*
       7. **** Написать метод, которому на вход подается одномерный массив и число n
       (может быть положительным, или отрицательным), при этом метод должен сместить
       все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться
        вспомогательными массивами.
        */
        System.out.println("7. **** Написать метод, которому на вход подается одномерный массив и число n\n" +
                "       (может быть положительным, или отрицательным), при этом метод должен сместить\n" +
                "       все элементымассива на n позиций.\n"+
                "Введите число ");
        int shiftnum=0;
        try{
            shiftnum=in.nextInt();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Это не число");
        }
        System.out.println(Arrays.toString(minmax));
        System.out.println(shift(minmax, shiftnum));

    }
/*
Знаю, что это не оптимальный механизм, но ничего лучше без интернета пока не придумал. И не успеваю оптимизировать
так чтобы если сдиг на большее число чем длина массива отбрасывалось n длин массива и сдвигалось лишь на остаток
деления на длину массива
 */
    private static String shift(byte[] shift, int shiftnum) {
        byte temp;
        if (shiftnum>0) {
            for (int j = 0; j < shiftnum; j++)
                for (int i = 1; i < shift.length; i++) {
                    temp = shift[i];
                    shift[i] = shift[0];
                    shift[0] = temp;
                }
        }
        else
        {
            for (int j = shiftnum; j < 0; j++)
                for (int i = shift.length-2; i >= 0; i--) {
                    temp = shift[i];
                    shift[i] = shift[shift.length-1];
                    shift[shift.length-1] = temp;
                }
        }
        return Arrays.toString(shift);
    }

    private static String mirror() {
        int ArrSize=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива\n");
        try{
            ArrSize=in.nextInt();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Это не число");
        }
        if (ArrSize<=0)
        {
            return ("Вы ввели некорректное значение длины строки");
        }
        int[] mirror_array = new int[ArrSize];
        int sumRight=0;
        for (int i = 0; i < ArrSize; i++)
        {
            System.out.printf("\n Введите %d элемент массива ", (i+1));
            try{
                mirror_array[i]=in.nextInt();
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Это не число");
                mirror_array[i] = 0;
            }
            sumRight=sumRight+mirror_array[i];
        }


                if (sumRight == 0)
                {
                    return  ("Это пустой массив");
                }

        int sumleft=0;
        for (int i=0; i<ArrSize; i++)
            {
                sumleft = sumleft+mirror_array[i];
                sumRight = sumRight - mirror_array[i];
                if (sumleft == sumRight)
                {
                    return ("True " + (i+1));
                }
            }
        return ("false");
    }
}

