package com.max.idea;

public class Homework3 {
    public static void main(String[] args){
        int[] myArray = {1, 22, 3, 44, 5};

        //Меняем местами первый и последний элементы массива
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = temp;
        //Стал массив {5, 22, 3, 44, 1}

        //Выводим в консоль сумму первого и среднего элемента
        int sum = myArray[0] + myArray[(myArray.length-1)/2];
        System.out.println("Сумма первого и среднего элементов: " + sum);
    }
}
