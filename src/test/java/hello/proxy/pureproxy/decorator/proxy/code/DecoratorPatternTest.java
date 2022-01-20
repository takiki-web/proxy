package hello.proxy.pureproxy.decorator.proxy.code;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator(){
        Component realCompnent = new RealCompnent();
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(realCompnent);

        decoratorPatternClient.execute();
        decoratorPatternClient.execute();
        decoratorPatternClient.execute();
    }

    @Test
    void Decorator() {
        Component realComponent = new RealCompnent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatternClient decoratorPatternClient = new DecoratorPatternClient(messageDecorator);
        decoratorPatternClient.execute();
    }

    @Test
    void DecoratorChain(){
        Component realComponent = new RealCompnent();
        Component messageDecorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();

    }
}
