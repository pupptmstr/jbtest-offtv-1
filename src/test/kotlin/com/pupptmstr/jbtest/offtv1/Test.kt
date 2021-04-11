package com.pupptmstr.jbtest.offtv1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun smallTest() {
        val smallNamesList = mutableListOf<String>()
        //5
        smallNamesList.add("abc")
        smallNamesList.add("abd")
        smallNamesList.add("adc")
        smallNamesList.add("rvy")
        smallNamesList.add("xyz")
        assertEquals("arxbdcefghijklmnopqstuvwyz", restoreAlphabet(
            buildAdjacencyListForAlphabet(
                smallNamesList
            )
        ))
    }

    @Test
    fun middleTest() {
        val middleNamesList = mutableListOf<String>()
        //20
        middleNamesList.add("aaliyah")
        middleNamesList.add("abby")
        middleNamesList.add("abigail")
        middleNamesList.add("ada")
        middleNamesList.add("adalee")
        middleNamesList.add("adaline")
        middleNamesList.add("adalyn")
        middleNamesList.add("adalynn")
        middleNamesList.add("addilyn")
        middleNamesList.add("addilynn")
        middleNamesList.add("addison")
        middleNamesList.add("addisyn")
        middleNamesList.add("addyson")
        middleNamesList.add("adelaide")
        middleNamesList.add("adele")
        middleNamesList.add("adelina")
        middleNamesList.add("adeline")
        middleNamesList.add("adelyn")
        middleNamesList.add("adelynn")
        middleNamesList.add("adley")
        assertEquals("abdelsiycfghjkmnopqrtuvwxz", restoreAlphabet(
            buildAdjacencyListForAlphabet(
                middleNamesList
            )
        ))
    }

    @Test
    fun largeTest() {
        val largeNamesList = mutableListOf<String>()
        //92
        largeNamesList.add("aaliyah")
        largeNamesList.add("abby")
        largeNamesList.add("abigail")
        largeNamesList.add("ada")
        largeNamesList.add("adalee")
        largeNamesList.add("adaline")
        largeNamesList.add("adeline")
        largeNamesList.add("adelyn")
        largeNamesList.add("adelynn")
        largeNamesList.add("adley")
        largeNamesList.add("bailee")
        largeNamesList.add("bailey")
        largeNamesList.add("barbara")
        largeNamesList.add("bellamy")
        largeNamesList.add("belle")
        largeNamesList.add("berkley")
        largeNamesList.add("bethany")
        largeNamesList.add("bexley")
        largeNamesList.add("bianca")
        largeNamesList.add("blair")
        largeNamesList.add("brianna")
        largeNamesList.add("briar")
        largeNamesList.add("bridget")
        largeNamesList.add("briella")
        largeNamesList.add("brielle")
        largeNamesList.add("brinley")
        largeNamesList.add("cali")
        largeNamesList.add("callie")
        largeNamesList.add("calliope")
        largeNamesList.add("cameron")
        largeNamesList.add("camila")
        largeNamesList.add("camilla")
        largeNamesList.add("cassandra")
        largeNamesList.add("cassidy")
        largeNamesList.add("charlee")
        largeNamesList.add("charleigh")
        largeNamesList.add("charley")
        largeNamesList.add("dalary")
        largeNamesList.add("daleyza")
        largeNamesList.add("dallas")
        largeNamesList.add("dana")
        largeNamesList.add("dani")
        largeNamesList.add("daniela")
        largeNamesList.add("daniella")
        largeNamesList.add("danielle")
        largeNamesList.add("danna")
        largeNamesList.add("destiny")
        largeNamesList.add("diana")
        largeNamesList.add("dior")
        largeNamesList.add("dorothy")
        largeNamesList.add("dream")
        largeNamesList.add("dulce")
        largeNamesList.add("dylan")
        largeNamesList.add("journey")
        largeNamesList.add("journi")
        largeNamesList.add("joy")
        largeNamesList.add("joyce")
        largeNamesList.add("judith")
        largeNamesList.add("juliette")
        largeNamesList.add("julissa")
        largeNamesList.add("june")
        largeNamesList.add("juniper")
        largeNamesList.add("jurnee")
        largeNamesList.add("justice")
        largeNamesList.add("kadence")
        largeNamesList.add("kaelyn")
        largeNamesList.add("kai")
        largeNamesList.add("kaia")
        largeNamesList.add("kailani")
        largeNamesList.add("kallie")
        largeNamesList.add("lacey")
        largeNamesList.add("laila")
        largeNamesList.add("lailah")
        largeNamesList.add("lainey")
        largeNamesList.add("lana")
        largeNamesList.add("landry")
        largeNamesList.add("laney")
        largeNamesList.add("lara")
        largeNamesList.add("laura")
        largeNamesList.add("laurel")
        largeNamesList.add("lauren")
        largeNamesList.add("lauryn")
        largeNamesList.add("layla")
        largeNamesList.add("laylah")
        largeNamesList.add("lea")
        largeNamesList.add("leah")
        largeNamesList.add("leanna")
        largeNamesList.add("lexi")
        largeNamesList.add("lexie")
        largeNamesList.add("leyla")
        largeNamesList.add("lia")
        largeNamesList.add("liana")
        assertEquals("ahbcdjkeiolnmrsutxyfgpqvwz", restoreAlphabet(
            buildAdjacencyListForAlphabet(
                largeNamesList
            )
        ))
    }

    @Test
    fun testToFail() {
        val smallNamesList = mutableListOf<String>()
        //5
        smallNamesList.add("abc")
        smallNamesList.add("abd")
        smallNamesList.add("adc")
        smallNamesList.add("acd")
        smallNamesList.add("xyz")
        assertEquals("Impossible", restoreAlphabet(
            buildAdjacencyListForAlphabet(
                smallNamesList
            )
        ))
    }
}