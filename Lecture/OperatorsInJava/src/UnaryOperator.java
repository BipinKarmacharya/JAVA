public class UnaryOperator {
    public static void main(String[] args) {
        int u = 5;
        int v = u++;
        int w = u--;
        int x = ++u;
        int y = --u;
        int z = -u;

        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
