package am.ak.spring.data.canstuctor;

/**
 * Created by karlen on 3/16/17.
 */
public class Foo {

    private Bar bar;

    private Baz baz;

    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
    }

    public Bar getBar() {
        return bar;
    }

    public Baz getBaz() {
        return baz;
    }
}
