import java.util.HashMap;
import java.util.Map;

//最简单的bean容器
public class BeanFactory {
    private Map<String, Object> beanmap = new HashMap<>();

    //注册bean
    public void registerBean(String name, Object bean) {
        beanmap.put(name, bean);
    }

    //获取bean
    public Object getBean(String name) {
        return beanmap.get(name);
    }
}