
import java.io.File

fun main(args: Array<String>) {
    var count = 0
    val lineList = mutableListOf<String>()
    val fileName = "puzzle_01_2"

    try {
        // Abre o arquivo localizado na pasta resources do projeto
        val path = ClassLoader.getSystemResource(fileName).file

        File(path).useLines { lines -> lines.forEach { lineList.add(it) }}

        for (x in 1..lineList.size-1) {
            if (lineList[x] > lineList[x-1]) count++
        }

        println("Quantas medidas são maiores que a medida anterior? $count")

    } catch (e: NullPointerException) {
        println("Problema ao abrir o arquivo")
    }
}