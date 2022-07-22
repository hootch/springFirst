package hello.core.web;

import org.springframework.stereotype.Service;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    
    public final MyLogger myLogger ; 

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }

    
}
