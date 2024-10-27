public class return_func {
    static int myMethod (int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        int z = myMethod(5, 5);

        System.out.println(z);
    }
}
