package vanilla.singleton;

public class Main {

    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("LAZY HOLDER");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        System.out.println("EAGER");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

    }

}
