fun main() {
    print("Введите количество строк: ")
    val rows = readLine()?.toIntOrNull() ?: return
    print("Введите количество столбцов: ")
    val cols = readLine()?.toIntOrNull() ?: return

    val array = Array(rows) { IntArray(cols) }

    println("Введите трехзначные числа:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            var inputNumber: Int?
            do {
                print("Введите трехзначное число для позиции [$i][$j]: ")
                inputNumber = readLine()?.toIntOrNull()
                if (inputNumber == null || inputNumber !in 100..999 && inputNumber !in -999..-100) {
                    println("Ошибка: необходимо ввести трёхзначное число.")
                }
            } while (inputNumber == null || inputNumber !in 100..999 && inputNumber !in -999..-100)

            array[i][j] = inputNumber
        }
    }

    println("Ваш массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]}\t")
        }
        println()
    }

    val uniqueDigits = mutableSetOf<Char>()

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            val number = array[i][j].toString()
            for (digit in number) {
                uniqueDigits.add(digit)
            }
        }
    }

    println("В массиве использовано ${uniqueDigits.size} различных цифр")
}
