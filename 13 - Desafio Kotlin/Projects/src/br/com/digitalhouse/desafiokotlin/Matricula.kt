package br.com.digitalhouse.desafiokotlin

import java.util.*

class Matricula(var aluno: Aluno, var curso: Curso) {
    var data = Date()

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, data=$data)"
    }
}