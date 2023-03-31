public class TesteWhile2 {
    public static void main(String[] args) {
        int x = 9;
        int y = 1;
        if (x < 1 || x > 10) {
            System.out.println("Numero fora do intervalo permitido");
        } else
            System.out.println("A tabuada de " + x + "e");
        while (y <= 10) {
            y++;
            int resultado = (x * y);
            System.out.println(x + " x " + y + " = " + resultado);
        }
    }

}
