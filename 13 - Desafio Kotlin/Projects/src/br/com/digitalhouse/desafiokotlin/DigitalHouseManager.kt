package br.com.digitalhouse.desafiokotlin

class DigitalHouseManager {
    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessores = mutableSetOf<Professor>()
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaCursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        var curso = listaCursos.firstOrNull { it.codigo == codigoCurso }
        if (curso != null) listaCursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaProfessores.add(ProfessorAdjunto(codigoProfessor, nome, sobrenome, 0, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaProfessores.add(ProfessorTitular(codigoProfessor, nome, sobrenome, 0, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        var professor = listaProfessores.firstOrNull { it.codigo == codigoProfessor }
        if (professor != null) listaProfessores.remove(professor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var curso = listaCursos.firstOrNull { it.codigo == codigoCurso }
        var aluno = listaAlunos.firstOrNull { it.codigo == codigoAluno }

        if (curso != null) {
            if (aluno != null) {
                if (curso.adicionarUmAluno(aluno)) {
                    listaMatriculas.add(Matricula(aluno, curso))
                } else {
                    println("A matricula não pode ser realizada! Motivo: Não há mais vagas nesta turma")
                }
            } else {
                println("Aluno não encontrado")
            }
        } else {
            println("Curso não encontrado")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var curso = listaCursos.firstOrNull { it.codigo == codigoCurso }
        var professorAdjunto = listaProfessores.firstOrNull { it.codigo == codigoProfessorAdjunto }
        var professorTitular = listaProfessores.firstOrNull { it.codigo == codigoProfessorTitular }

        if (curso != null){
            if (professorAdjunto != null) {
                if (professorTitular != null) {
                    curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
                    curso.professorTitular = professorTitular as ProfessorTitular
                } else {
                    println("Professor Titular não encontrado")
                }
            } else {
                println("Professor Adjunto não encontrado")
            }
        } else {
            println("Curso não encontrado")
        }
    }

    override fun toString(): String {
        return "DigitalHouseManager(listaAlunos=$listaAlunos, listaProfessores=$listaProfessores, listaCursos=$listaCursos, listaMatriculas=$listaMatriculas)"
    }
}