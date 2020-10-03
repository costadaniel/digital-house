package br.com.digitalhouse.desafiokotlin

class Curso(var nome: String, var codigo: Int,var quantidadeMaximaDeAlunos: Int) {
    var professorAdjunto: ProfessorAdjunto? = null
    var professorTitular: ProfessorTitular? = null
    var listaAlunos = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunos.size + 1 <= quantidadeMaximaDeAlunos) {
            listaAlunos.add(umAluno)
            return true
        } else {
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunos.remove(umAluno)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigo != other.codigo) return false

        return true
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigo=$codigo, maxAlunos=$quantidadeMaximaDeAlunos, professorAdjunto=$professorAdjunto, professorTitular=$professorTitular, listaAlunos=$listaAlunos)"
    }
}