package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
   public String nome;
   public int idade;
   public double[] salarios;

   public void imprime(){
       System.out.println(this.nome);
       System.out.println(this.idade);
       if (salarios != null){
           for(double salario: salarios) {
               System.out.println(salario);
           }
       }

   }

   public void imprimeMediaSalarios(){
       double media = 0;
       for(double salario: salarios){
           media += salario;
       }
       media /= salarios.length;
       System.out.println("Média salarial "+media);
   }
}
