package com.pupptmstr.jbtest.offtv1

enum class Color {
    WHITE, GREY, BLACK;

    override fun toString(): String {
        return super.toString().toLowerCase()[0].toString()
    }
}