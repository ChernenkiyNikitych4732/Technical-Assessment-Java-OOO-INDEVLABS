public class MissingNumberFinder {

    /**
     * 1) Подключить функцию для поиска недостающего числа в массиве.
     * 2) Написать формула для нахождения всех чисел в массиве.
     * 3) Найти минимальное значение числа в массиве.
     * 4) Найти максимальное значения числа в массиве.
     * 5) Сделать расчет ожидаемой сумму арифметической прогрессии.
     * 6) Вернуть недостающее число в массиве.
     * 7) Написать Основные методы для тестирования функции.
     * 8) Добавить JUnit тест для проверки.
     */

    public static int findMissingNumber(int[] arr) { // Создаем функцию для нахождения недостающего числа в массиве; (Чтобы вызвать функцию, надо нажать на следующие кнопки Alt + Insert, если вы работаете на Windows (или ⌘N если вы работаете на macOS);
        int actualSum = 0;
        for (int num : arr) { //  // Формула для нахождения всех чисел в массиве
            actualSum += num;
        }

        int min = Integer.MAX_VALUE; // Ищем минимальное значение числа в массиве;
        int max = Integer.MIN_VALUE; // Ищем максимальное значение числа в массиве;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2; // Делаем расчет для ожидаемой суммы арифметической прогрессии;
        return expectedSum - actualSum; // Возращение недостающего числа в массив;
    }

    public static void main(String[] args) { // Основной метод для тестирования;
        int[] arr1 = {5, 0, 1, 3, 2};
        System.out.println(findMissingNumber(arr1)); // Тест № 1: Пропущенное число в середине;
        int[] arr2 = {7, 9, 10, 11, 12};
        System.out.println(findMissingNumber(arr2)); // Тест № 2: Пропущенное число в начале диапазона;
        int[] arr3 = {1, 2, 4, 5, 6};
        System.out.println(findMissingNumber(arr3)); // Тест № 3: Пропущенное число 3;
        int[] arr4 = {0, 1, 2, 3};
        System.out.println(findMissingNumber(arr4)); // Тест № 4: Последовательность без пропусков;
        int[] arr5 = {2, 3, 4, 5, 6};
        System.out.println(findMissingNumber(arr5)); // Тест № 5: Пропущено минимальное число;
        int[] arr6 = {1};
        System.out.println(findMissingNumber(arr6)); // Тест № 6: Один элемент в массиве;
        int[] arr7 = {1, 2, 3, 4};
        System.out.println(findMissingNumber(arr7)); //Тест № 7: Пустой массив;
    }
}