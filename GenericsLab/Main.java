package GenericsLab;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        jar.add(73);

        System.out.println(jar.remuve());
        System.out.println(jar.remuve());
    }
}
