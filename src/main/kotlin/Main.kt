fun main() {
    print("Введите количество строк: ")
    val rows = readLine()?.toIntOrNull() ?: return
    print("Введите количество столбцов: ")
    val cols = readLine()?.toIntOrNull() ?: return

    val array = Array(rows) { IntArray(cols) }

    println("Введите трехзначные числа:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readLine()?.toIntOrNull() ?: return
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
