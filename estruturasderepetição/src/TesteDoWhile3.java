public class TesteDoWhile3 {
    public static void main(String[] args) {
        int x = 9;
        int y = 1;
        System.out.println("A tabuada de " + x + " e");
        do {
            if (x < 1 || x > 10) {
                System.out.println("Numero fora do intervalo permitido");
            } else {
                int resultado = (x * y);
                System.out.println(x + " x " + y + " = " + resultado);
                y++;
            }
        } while (y <= 10);
    }
}
