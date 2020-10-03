package br.com.digitalhouse.desafiokotlin

class Aluno(var nome: String, var sobrenome:String, var codigo: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "Aluno(nome='$nome', sobrenome='$sobrenome', codigo=$codigo)"
    }
}