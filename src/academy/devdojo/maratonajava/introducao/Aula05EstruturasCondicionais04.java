package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double precisaPagar;
        String taxa;

        if(salarioAnual <= 34712){
            precisaPagar = salarioAnual * (9.70/100);
            taxa = "9.70%";
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            precisaPagar = salarioAnual * (37.35/100);
            taxa = "37.35%";
        }else{
            precisaPagar = salarioAnual * (49.50/100);
            taxa = "49.50%";
        }
        System.out.println("Com uma taxa de "+taxa+" você precisa pagar: "+precisaPagar);
    }
}
