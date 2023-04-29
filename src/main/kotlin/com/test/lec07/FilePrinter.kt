package com.test.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    /**
     * exception에 대한 경고가 없음.
     *
     * throw 구문을 표현하지 않아도 된다.
     *
     * 모두 unchecked exception 으로 처려
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /**
     * try with resources 코틀린 활용법. use in line 확장 함수 사용.
     */
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
        }
    }

}