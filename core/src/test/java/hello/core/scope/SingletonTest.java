package hello.core.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class SingletonTest {


    @Test
    void singletoneBeanFind(){
        
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletoneBean.class);

        SingletoneBean singletoneBean1 = ac.getBean(SingletoneBean.class);
        SingletoneBean singletoneBean2 = ac.getBean(SingletoneBean.class);
        System.out.println("singletoneBean1 = " + singletoneBean1);
        System.out.println("singletoneBean2 = " + singletoneBean2);
        Assertions.assertThat(singletoneBean1).isSameAs(singletoneBean2);
        ac.close();
    }

    @Scope("singleton")
    static class SingletoneBean{

        @PostConstruct
        public void init() {
            System.out.println("SingletoneBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("SingletoneBean.destroy");
        }
    }

    
}
