package com.pupptmstr.jbtest.offtv1

fun main() {
    print(
        restoreAlphabet(
            buildAdjacencyListForAlphabet(
                readNames()
            )
        )
    )
}

fun readNames() : List<String> {
    val numOfNames = readLine()?.toInt()
    if (numOfNames in 1..100) {
        val names = mutableListOf<String>()
        for (i in 0 until numOfNames!!) {
            names.add(readLine()!!)
        }
        return names
    } else {
        throw NumberFormatException("num have to be in range (1..100)")
    }
}

fun buildAdjacencyListForAlphabet(names: List<String>): Map<Char, List<Char>> {
    TODO("строим список смежности букв" +
            "(сверяем слова, первое различие записываем в список смежности (значения меньше ключа)) " +
            "и возвращаем его")
}

fun restoreAlphabet(adjacencyList: Map<Char, List<Char>>): String {
    TODO("проверяем список смежности на ацикличность, " +
            "если цикл - невозможно, иначе - восстанавливаем алфавит полным обходом")
}