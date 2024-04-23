package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationCtx;

    @Autowired
    MyController myController;

    @Test
    void TestAutowireOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromCtx() {
        MyController controller = applicationCtx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
