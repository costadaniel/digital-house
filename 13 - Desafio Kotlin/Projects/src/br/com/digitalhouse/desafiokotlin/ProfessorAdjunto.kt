package br.com.digitalhouse.desafiokotlin

class ProfessorAdjunto(override var codigo: Int, override var nome: String, override var sobrenome: String, override var tempo: Int, var monitoria: Int) : Professor {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorAdjunto

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "ProfessorAdjunto(codigo=$codigo, nome='$nome', sobrenome='$sobrenome', tempo=$tempo, monitoria=$monitoria)"
    }
}