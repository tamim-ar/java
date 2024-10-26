public class string{
    public static void main(String[] args){
        String name = "Tamim";
        System.out.println(name);
        System.out.println(name.charAt(0));

        String name2 = name.replace('T','0');
        System.out.println(name2);

        String name3 = "Tamim Ahasan Rijon";
        System.out.println(name3.substring(13, 18));
    }
}