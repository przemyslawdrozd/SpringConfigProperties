package workshop.sb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//        TODO 3 wstrzyknij MyConfig

    @Autowired
    private MyConfig myConfig;

//        TODO 4 zdefiniuj metody kontrolera, zwracające wartości z test.property.foo, ...bar i ...x
    @RequestMapping("/foo")
    public String getFoo(){
        return myConfig.getFoo();
    }

    @RequestMapping("/bar")
    public String getBar(){
        return myConfig.getBar();
    }

    @RequestMapping("/x")
    public int getX(){
        return myConfig.getX();
    }
/*
          TODO 5  napisz test kontrollera

          Użyj @TestPropertySource na kalsie dla wskazania pliku properties
          Wstrzyknij w test Environment - pobierz z niego wartości propertisów dla porównania tych przychodzących z kontrolera
        */
}
