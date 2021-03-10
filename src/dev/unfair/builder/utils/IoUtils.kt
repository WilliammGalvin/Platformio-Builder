package dev.unfair.builder.utils

import java.io.File

object IoUtils {

    fun writeToFile(file: File, line: String, lineNum: Int) {
        val lines = fileToList(file)
        val nextText = mutableListOf<String>()

        var count = 0
        for (l in lines) {
            if (lineNum == count) {
                nextText.add(line)
                count++
                continue
            }

            nextText.add(l)
            count++
        }

        file.printWriter().use {out ->
            for (l in nextText) {
                out.println(l)
            }
        }

    }

    fun fileToList(file: File): List<String>
            = file.useLines { it.toList() }

}