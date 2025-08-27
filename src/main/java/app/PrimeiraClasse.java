package app;

import java.util.List;
import java.util.ArrayList;

public class PrimeiraClasse{
    public static void main(String[] args){
     System.out.println("Olá Gradle!!!");
     

     Aluno a1 = new Aluno();// Aluno() Metodo construtor da classe chamado de construtor

     a1.setId(1);
     a1.setNome("marco");
     a1.setIdade(45);

     System.out.println(a1.getNome());


    Tarefa t1 = new Tarefa();
    t1.setDescricao("Estudar Estruturas de Dados");
    t1.setConcluido(true);

    Tarefa t2 = t1;
    t2.setDescricao("Exemplo de Tarefa");

    System.out.println(t1.getDescricao());
    System.out.println(t2.getDescricao());


    List<Atividade> agenda = new ArrayList<Atividade>();
    agenda.add(t1);
    Compromisso c1 = new Compromisso();
    agenda.add(c1);


    }
}