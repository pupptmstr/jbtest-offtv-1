package com.pupptmstr.jbtest.offtv1

const val ALPHABET_SIZE = 26

fun createEmptyAdjacencyList(): MutableMap<Char, MutableSet<Char>> {
    val res = mutableMapOf<Char, MutableSet<Char>>()
    res['a'] = mutableSetOf()
    res['b'] = mutableSetOf()
    res['c'] = mutableSetOf()
    res['d'] = mutableSetOf()
    res['e'] = mutableSetOf()
    res['f'] = mutableSetOf()
    res['g'] = mutableSetOf()
    res['h'] = mutableSetOf()
    res['i'] = mutableSetOf()
    res['j'] = mutableSetOf()
    res['k'] = mutableSetOf()
    res['l'] = mutableSetOf()
    res['m'] = mutableSetOf()
    res['n'] = mutableSetOf()
    res['o'] = mutableSetOf()
    res['p'] = mutableSetOf()
    res['q'] = mutableSetOf()
    res['r'] = mutableSetOf()
    res['s'] = mutableSetOf()
    res['t'] = mutableSetOf()
    res['u'] = mutableSetOf()
    res['v'] = mutableSetOf()
    res['w'] = mutableSetOf()
    res['x'] = mutableSetOf()
    res['y'] = mutableSetOf()
    res['z'] = mutableSetOf()
    return res
}

fun createStartColorsList(): MutableList<Color> {
    val colors = mutableListOf<Color>()
    for (i in 0 until ALPHABET_SIZE) {
        colors.add(Color.WHITE)
    }

    return colors
}