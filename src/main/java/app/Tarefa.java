package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tarefa extends Atividade {
   private boolean isConcluido; //Boolean != boolean
  
   @Override
   public String toString() {
      return this.getDescricao() + "(" + this.isConcluido + ")";
   }

}