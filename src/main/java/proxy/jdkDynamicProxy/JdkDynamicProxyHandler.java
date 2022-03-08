package proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lqb
 * @date 2022/3/8 11:03
 */
public class JdkDynamicProxyHandler implements InvocationHandler {

    private final Object object;

    public JdkDynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我在看房");
        Object result = method.invoke(object, args);
        System.out.println("我入住了");
        return result;
    }
}
