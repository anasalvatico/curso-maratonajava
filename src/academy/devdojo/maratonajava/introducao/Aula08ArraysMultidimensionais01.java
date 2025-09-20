package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 29;
        dias[0][2] = 28;

        dias[1][0] = 20;
        dias[1][1] = 19;
        dias[1][2] = 18;

        dias[2][0] = 7;
        dias[2][1] = 6;
        dias[2][2] = 5;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrayBase: dias){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }

}


