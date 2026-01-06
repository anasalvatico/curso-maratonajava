package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");
        pessoa.setIdade(20);

        //pessoa.imprime();
        System.out.println(pessoa.GetNome());
        System.out.println(pessoa.GetIdade());

    }
}
