import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /* #ДЗУрок3 ДЭДЛАЙН 08.06.2023 23 59
ДЗ:
Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа и вывести его на экран
 (8, -2, -4, 2, 3, 6, -7) =  11/3
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
 При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
{ -7, -4, -2, 2, 3, 6, 8}


     */
        double hw3 = 0;
        int hw33 = 0;

        double[] example = {5.5, 6.6, -7.7, 5.9, 6.89, 8.8, -16.8, 45.2, 23.6, 4.8, 7.9, 9.6, -12.6, 23.2, 4.3};
        for (double each : example) {
            if (each > 0) {
                hw3 += each;
                hw33++;
            }



        }System.out.println((float) hw3 / hw33);
        bubbleSort(example);


    }

    private static void bubbleSort(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}