
public class ExercicioCondicional {
    public static void main(String[] args) {
        double salario = 30000;
        double impostoRenda = 0;
        if (salario <= 2826.66)
            impostoRenda = 0;
        else if (salario <= 3751.05)
            impostoRenda = (salario * 0.15) - 354.80;
        else if (salario <= 4664.68)
            impostoRenda = (salario * 0.225) - 636.13;
        else
            impostoRenda = (salario * 0.275) - 869.36;
        

        System.out.printf("Seu salario BRUTO e: R$ " + salario + "\nSeu salario LIQUIDO e: R$ %.2f",salario - impostoRenda);

        boolean salario2;
        salario2 = (salario >= 20000) ? true : false;
        System.out.println(salario2 ? "\nSalario de diretor" : "\nSalario de empregado");

        
    }
}
