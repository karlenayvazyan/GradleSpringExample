package am.ak.spring.data.canstuctor;

import java.beans.ConstructorProperties;

/**
 * Created by karlen on 3/16/17.
 */
public class ExampleBean {

    private int years;

    private String ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public int getYears() {
        return years;
    }

    public String getUltimateAnswer() {
        return ultimateAnswer;
    }
}
