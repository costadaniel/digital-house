package br.com.digitalhouse.desafiokotlin

class ProfessorTitular(override var codigo: Int, override var nome: String, override var sobrenome: String, override var tempo: Int, var especialidade: String) : Professor {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorTitular

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "ProfessorTitular(codigo=$codigo, nome='$nome', sobrenome='$sobrenome', tempo=$tempo, especialidade='$especialidade')"
    }
}