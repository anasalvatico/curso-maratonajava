package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long. float e double 0
        // char '\u0000'
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Julia";
        nomes[2] = "Pedro";
        nomes[3] = "Leticia";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
            
        }
    }
    
}
