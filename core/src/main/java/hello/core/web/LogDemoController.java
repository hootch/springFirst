package hello.core.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LogDemoController {
    
    public final LogDemoService logDemoService; 
    private MyLogger myLogger ; 
    
    @RequestMapping("log-demo")//log-demo라는 요청이 오면
    @ResponseBody //view화면 없이 바로 바디를 반환하기 위해
    public String logDemo(HttpServletRequest request){
        String requestURL = request.getRequestURL().toString();
        myLogger.setRequestURL(requestURL);
        myLogger.log("controller test");
        logDemoService.logic("testID");   
        return "OK";
            
    }



}
