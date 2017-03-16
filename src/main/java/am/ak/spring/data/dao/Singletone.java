package am.ak.spring.data.dao;

/**
 * Created by karlen on 3/15/17.
 */
public final class Singletone {

    private volatile static Singletone instance;

    private Singletone () {}

    public static Singletone getInstance() {
        if (instance == null) {
            synchronized (Singletone.class) {
                if (instance == null){
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }
}
