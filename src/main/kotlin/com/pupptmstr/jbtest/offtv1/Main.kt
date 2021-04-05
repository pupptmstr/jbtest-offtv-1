package com.pupptmstr.jbtest.offtv1

import java.lang.Integer.min

fun main() {
    print(
        restoreAlphabet(
            buildAdjacencyListForAlphabet(
                readNames()
            )
        )
    )
}

fun readNames(): List<String> {
    print("Enter number of names: ")
    val numOfNames = readLine()?.toInt()
    if (numOfNames in 1..100) {
        val names = mutableListOf<String>()
        println("Enter names:")
        for (i in 0 until numOfNames!!) {
            names.add(readLine()!!.toLowerCase())
        }
        return names
    } else {
        throw NumberFormatException("num have to be in range (1..100)")
    }
}

fun buildAdjacencyListForAlphabet(names: List<String>): MutableMap<Char, MutableSet<Char>> {
    val adjacencyList: MutableMap<Char, MutableSet<Char>> = createEmptyAdjacencyList()
    for (i in names.indices) {
        if (i != names.indices.last) {
            for (j in i until names.size) {
                val minLength = min(names[i].length, names[j].length)
                for (k in 0 until minLength) {
                    val letterFirst = names[i].toCharArray()[k]
                    val letterSecond = names[j].toCharArray()[k]
                    if (letterFirst != letterSecond) {
                        if (adjacencyList[letterFirst] != null) {
                            adjacencyList[letterFirst]!!.add(letterSecond)
                        }
                        break
                    }
                }
            }
        }
    }
    return adjacencyList
}



fun restoreAlphabet(adjacencyList: MutableMap<Char, MutableSet<Char>>): String {
    val roots = mutableMapOf<Char, Boolean>()//true - корень
    val colors = createStartColorsList()
    val res = StringBuilder()
    for (letters in adjacencyList) {
        if (roots[letters.key] == null) {
            roots[letters.key] = true
        }
        for (letter in letters.value) {
            roots[letter] = false
        }
    }

    for (root in roots) {
        if (root.value) {
            val tempRes = dfs(adjacencyList, root.key, colors)
            if (tempRes == "Impossible") {
                return "Impossible"
            }
            res.append(tempRes.reversed())
        }
    }
    /*Если где-то сложилась ситуация, что цикл завязан только на его составляющих, то в корень ни одна из этих букв не
    * попадет, соответственно dfs на ней не будет запущен, соответственно в алфавит не внесутся эти символы,
    * от таких циклов убережет эта проверка*/
    return if (res.toString().length != ALPHABET_SIZE) {
        "Impossible"
    } else {
        res.toString()
    }
}

fun dfs(adjacencyList: MutableMap<Char, MutableSet<Char>>, vertex: Char, colors: MutableList<Color>) : String {
    val vertexPosition = vertex - 'a'
    val res = StringBuilder()
    if(colors[vertexPosition] == Color.GREY) {
        return "Impossible"
    } else {
        if (colors[vertexPosition] == Color.BLACK) {
            return ""
        }
        colors[vertexPosition] = Color.GREY
        if (adjacencyList[vertex].isNullOrEmpty()) {
            colors[vertexPosition] = Color.BLACK
            return vertex.toString()
        } else {
            for (newVertex in adjacencyList[vertex.toLowerCase()]!!) {
                val tempRes = dfs(adjacencyList, newVertex, colors)
                if (tempRes.contains("Impossible")) {
                    return "Impossible"
                } else {
                    res.append(tempRes)
                }
            }
            colors[vertexPosition] = Color.BLACK
            res.append(vertex)
        }
        return res.toString()
    }
}