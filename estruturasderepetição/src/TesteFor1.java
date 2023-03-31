public class TesteFor1 {

    public static void main(String[] args) {
        for (int x = 0; x <= 3; x+=1) {
            System.out.println("x = " + x);
        }

        int y;
        for (y = 3; y >= 0; y-=1) {
            System.out.println("y = " + y);
        }
        System.out.println("Valor final de y = " + y);
    }
}
