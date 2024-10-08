import kotlin.math.sqrt
fun main() {
    println("\nЗадача 1: Чётное или нечётное число")
    println("\nУсловие: Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным")

    print("Введите целое число: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("Число $num является четным")
    } else {
        println("Число $num является нечетным")
    }
//----------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 2: Минимальное из трех чисел")
    println("\nУсловие: Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.")
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    print("Введите третье число: ")
    val c = readln().toInt()

    if (a < b && a < c) {
        println("Минимальное из чисел: $a")
    } else if (b < a && b < c) {
        println("Минимальное из чисел: $b")
    } else {
        println("Минимальное из чисел: $c")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 3: Таблица умножения")
    println("Условие: Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10)")
    val mult = 5

    for (i in 1..10) {
        val result = mult * i
        println("$mult x $i = $result")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 4: Сумма чисел от 1 до N")
    println("Условие: Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.")
    print("Введите число: ")
    val n = readln().toInt()

    var sum = 0
    for (i in 1..n) {
        print("$i + ")
        sum += i
    }
    sum += n
    print("$n = $sum")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 5: Число Фибоначчи")
    println("Условие: Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.")
    print("Введите число: ")
    val n1 = readln().toInt()
    if (n1 > 2) {
        println("Первые $n1 чисел Фибоначчи:")
        var a = 0
        var b = 1
        for (i in 1..n1) {
            print("$a ")
            val c = a + b   // Вычисление следующего числа Фибоначчи
            a = b
            b = c
        }
    } else {
        println("Введите корректное целое число!")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 6: Проверка простого числа")
    println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).")
    print("Введите число: ")
    val n2 = readln().toInt()
    var isPrime = true

    if (n2 < 2) {
        isPrime = false
    } else {
        for (i in 2..sqrt(n2.toDouble()).toInt()){
            if (n2 % i == 0) {
                isPrime = false
                break
            }
        }
    }
    println("Число $n2 является простым: $isPrime")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 7: Обратный порядок чисел")
    println("Условие: Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.")
    print("Введите число: ")
    val n3 = readln().toInt()


    for (i in n3 downTo 1) {
        print("$i ")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 8: Сумма четных чисел")
    println("Условие: Пользователь вводит два целых числа A и B. Программа должна найти сумму всех чётных чисел в диапазоне от A до B (включительно).")
    print("Введите число A: ")
    val nA = readln().toInt()
    print("Введите число B: ")
    val nB = readln().toInt()
    var sum1 = 0

    for (i in nA .. nB + 1) {
        if (i % 2 == 0) sum1 += i
    }
    print("сумма чётных чисел: $sum1")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 9: Реверс строки")
    println("Условие: Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.")
    print("Введите строку: ")
    val text = readln()
    val reverse = text.reversed()
    println("Строка в обратном порядке: $reverse")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 10: Количество цифр в числе")
    println("Условие: Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.")
    print("Введите целое число: ")
    val n4 = readln().toInt()
    val length1 = n4.toString().length
    println("Вывод: $length1")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 11: Факториал числа")
    println("Условие: Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).")
    print("Введите целое число: ")
    val n5 = readln().toInt()
    var res: Long = 1
    for (i in 1..n5) {
        res *= i
    }
    println(res)
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 12: Сумма цифр числа")
    println("Условие: Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.")
    print("Введите целое число: ")
    var n6 = readln().toInt()
    var sum2 = 0

    while (n6 != 0) {
        sum2 += n6 % 10
        n6 /= 10
    }
    println("Сумма всех цифр числа: $sum2")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 13: Палиндром")
    println("Условие: Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).")
    print("Введите строку: ")
    val str = readln().toLowerCase()

    // Проверка, является ли строка палиндромом
    if (str == str.reversed()) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
//    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 14: Найти максимальное число в массиве")
    println("Условие: Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.")
    print("Введите размер массива: ")
    val size = readln().toInt()
    println("Введите элементы массива: ")
    if (size > 0) {
        val mass =
            IntArray(size)                                               // класс для хранения массивов примитивного типа int
        for (i in 0 until size) {                                  // Это функция, возвращает диапазон от заданного нижнего значения до более высокого значения, но исключает более высокое значение.
            print("Элемент ${i + 1}-й: ")
            mass[i] = readln().toInt()
        }
        val max = mass.maxOrNull()                                       // Это функция, возвращает наибольший элемент коллекции.
        if (max != null) {
            println("Максимальное число в массиве: $max")
        }
    } else {
        println("Некорректный размер массива!")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 15: Сумма всех элементов массива")
    println("Условие: Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.")
    print("Введите размер массива: ")
    val size2 = readln().toInt()
    println("Введите элементы массива: ")
    if (size2 > 0) {
        val mass2 =
            IntArray(size2)                                           // класс для хранения массивов примитивного типа int
        for (i in 0 until size2) {                              // Это функция, возвращает диапазон от заданного нижнего значения до более высокого значения, но исключает более высокое значение.
            print("Элемент ${i + 1}-й: ")
            mass2[i] = readln().toInt()
        }
        val sum3 = mass2.sum()                                        // Это функция, возвращает сумму элемент коллекции.
        println("Сумма всех элементов массива: $sum3")
    } else {
        println("Некорректный размер массива!")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 16: Количество положительных и отрицательных чисел")
    println("Условие: Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.")
    print("Введите размер массива: ")
    val size3 = readln().toInt()

    println("Введите элементы массива: ")
    if (size3 > 0) {
        val mass3 = IntArray(size3)
        for (i in 0 until size3) {
            print("Элемент ${i + 1}-й: ")
            mass3[i] = readln().toInt()
        }
        var positive = 0
        var negative = 0

        for (number in mass3) {                          // аналогична оператору switch
            when {
                number > 0 -> positive++                 // Если число положительное, запускается операция positive++
                number < 0 -> negative++                 // Если число отрицательное, запускается операция negative++
            }
        }
        println("Количество положительных чисел: $positive")
        println("Количество отрицательных чисел: $negative")
    } else {
        println("Некорректный размер массива!")
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 17: Простые числа в диапазоне")
    println("Условие: Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).")
    print("Введите число A: ")
    val n1A = readln().toInt()
    print("Введите число B: ")
    val n1B = readln().toInt()
    print("Простые числа: ")
    for (number in n1A..n1B) {
        if (number < 2) continue
        var isPrime1 = true
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime1 = false // Найден делитель, число не простое
                break
            }
        }
        if (isPrime1) {
            print("$number ")
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 18: Подсчет гласных и согласных в строке")
    println("Условие: Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.")
    print("Введите строку: ")
    val str1 = readln().toLowerCase()
    var vowelsCount = 0
    var consonantsCount = 0
    val vowels = "aeiouаеёуоиэыяю"
    for (char in str1) {
        if (char.isLetter()) { // Проверяем, является ли символ буквой
            if (char in vowels) {
                vowelsCount++ // Увеличиваем счетчик гласных
            } else {
                consonantsCount++ // Увеличиваем счетчик согласных
            }
        }
    }
    println("Количество гласных букв: $vowelsCount")
    println("Количество согласных букв: $consonantsCount")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\nЗадача 19: Перестановка слов в строке")
    println("Условие: Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.")
    print("Введите строку: ")
    val str4 = readln()
    val words = str4.split(" ")                 // Принимает в качестве аргумента строку-разделитель и возвращает список строк.
    val reversedWords = words.reversed()
    val result = reversedWords.joinToString(" ")
    println("Слова в обратном порядке: $result")
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    println("\n\nЗадача 20: Число Армстронга")
    println("Условие: Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга " +
            "(сумма цифр в степени, равной количеству цифр, равна самому числу).")
    print("Введите число: ")
    val n7 = readln()
    val n8 = n7.toInt()
    val n7Dig = n7.length
    var sum7 = 0
    var orig = n8
    //числа Армстронга 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084, 548 834, 1 741 725 и т.д.
    while (orig > 0) {
        val dig = orig % 10
        sum7 += Math.pow(dig.toDouble(), n7Dig.toDouble()).toInt()
        orig /= 10
    }
    if (sum7 == n8) {
        println("$n8 - является числом Армстронга")
    } else {
        println("$n8 - не является числом Армстронга")
    }
    println()
}