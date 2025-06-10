package Alunos.entities;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private float[] notas;

    //Metodo para cadastrar notas
    public void CadastrarNotas() {
        Scanner sc = new Scanner(System.in);

        int quantNotas = 4;
        notas = new float[quantNotas];

        for(int k = 0; k < notas.length; k++){
            System.out.printf("Informe a nota %d: ", k+1);
            notas[k] = sc.nextFloat();
        }
    }

    //Metodos para calcular media
    public float CalcularMedia(){
        float cont = 0;
        for(float notas: notas){
            cont+=notas;
        }
        float media = cont/notas.length;

        return media;
    }

    //Verificar se o aluno está aprovado
    public void verificacao(){
        if(CalcularMedia() >= 7){
            System.out.print("Aluno aprovado!!");
        }
        else {
            System.out.print("Aluno reprovado!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public float[] getNotas() {
       return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNotas(float[] notas) {
        if(notas.length <= 4){
            this.notas = notas;
        }
        else{
            System.out.print("Informe no máximo 4 notas");
        }
    }
}
