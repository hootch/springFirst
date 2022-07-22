package hello.core;

import java.beans.Transient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;

@Configuration
@ComponentScan(
    basePackages = "hello.core",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    


    // @Bean(name = "memoryMemberRepository")
    // MemberRepository memberRepository(){
    //     return new MemoryMemberRepository();
    // }
    
}
