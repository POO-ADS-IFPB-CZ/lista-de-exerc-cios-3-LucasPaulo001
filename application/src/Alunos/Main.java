package Alunos;

import Alunos.entities.Aluno;
import Alunos.entities.Turma;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Turma turma = new Turma();

        aluno.setNome("Lucas");
        aluno.setMatricula(12345);

        aluno.CadastrarNotas();

        System.out.printf("\nNotas: \n");

        for(float nota : aluno.getNotas()){
            System.out.printf("%.2f\n", nota);
        }

        System.out.print("\nMédia do aluno " + aluno.getNome() + ": " + aluno.CalcularMedia() + "\n");

        aluno.verificacao();
        turma.tamanho(1);
        turma.setAlunos(0, aluno);
        turma.aprovados();

    }
}