
import org.junit.Test;

//最简单的bean容器

public class SimpleBeanContainerTest {
    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("bean1Service", new bean1Service());
        bean1Service bean1Service = (bean1Service) beanFactory.getBean("bean1Service");
        bean1Service.doSomething();
    }

    class bean1Service {
        public void doSomething() {
            System.out.println("bean1Service is doing something");
        }
    }
}