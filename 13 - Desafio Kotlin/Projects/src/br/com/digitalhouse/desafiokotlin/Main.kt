package br.com.digitalhouse.desafiokotlin

fun main() {
    var manager = DigitalHouseManager()

    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.registrarProfessorTitular("Rodrigo", "Silva", 30001, "Engenharia de Software")
    manager.registrarProfessorAdjunto("João", "Silva", 30002, 12)

    manager.alocarProfessores(20001, 30001, 30002)
    manager.alocarProfessores(20002, 30001, 30002)

    manager.matricularAluno("Fernando", "Araújo", 10001)
    manager.matricularAluno("Karine", "Soares", 10002)
    manager.matricularAluno("Carlos", "João", 10003)

    manager.matricularAluno(10001, 20001)
    manager.matricularAluno(10002, 20001)

    manager.matricularAluno(10001, 20002)
    manager.matricularAluno(10002, 20002)
    manager.matricularAluno(10003, 20002)

    println(manager)
}