package Alunos.entities;

public class Turma {
   private Aluno[] alunos;

    public void tamanho(int tamanho){
        alunos = new Aluno[tamanho];
    }

   //Metodo para listar alunos aprovados e reprovados
    public void aprovados (){
            System.out.print("\n\nAlunos aprovados:\n");
            for (Aluno aluno: alunos){
                if(aluno.CalcularMedia() >= 7){
                    System.out.println("Nome: " + aluno.getNome() + "\nMédia: " + aluno.CalcularMedia());
                }
            }
    }

    public void setAlunos(int posicao, Aluno aluno){
        if(posicao >= 0 && posicao < alunos.length){
            alunos[posicao] = aluno;
        }
    }
}
