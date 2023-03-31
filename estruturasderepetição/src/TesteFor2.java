
public class TesteFor2 {
    public static void main(String[] args) {
        int x = 9;
        int y;
        if(x < 1 || x > 10){
        System.out.println("Numero fora do intervalo permitido");
    }
        else
        System.out.println("A tabuada de " + x + "e");
        for(y = 1; y <= 10; y++){
            int resultado = (x * y);
        System.out.println(x + " x " + y + " = " + resultado);
        }
    }

}