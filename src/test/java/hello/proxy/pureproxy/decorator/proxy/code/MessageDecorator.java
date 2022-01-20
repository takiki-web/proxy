package hello.proxy.pureproxy.decorator.proxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component {

    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String result = component.operation();
        String decoRsult = "****" + result + "****";
        log.info("message 꾸미기전={}, message 꾸미기후={}", result, decoRsult);
        return decoRsult;
    }

}
