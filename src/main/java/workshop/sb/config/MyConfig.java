package workshop.sb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
    TODO 1 oznacz klasę adnotacją @Component i @ConfigurationProperties
         ConfigurationProperties - ustaw prefix na test.property
 */
@Component
@ConfigurationProperties(prefix = "test.property")
public class MyConfig {

    /*
        TODO 2 zadeklaruj pola w klasie dla zdefiniowanych propertisów
        do wstrzykiwania nie używaj @Value,
        skorzystaj z mapowania zapewnianego przez @ConfigurationProperties
        (przy ustawionej wartości prefix na "test.property")
     */

    private String foo;
    private String bar;
    private int x;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
