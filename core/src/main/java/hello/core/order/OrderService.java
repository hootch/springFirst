package hello.core.order;

import org.springframework.util.SocketUtils;

public interface OrderService {

    Order createOrder(Long memberId,String itemName, int itemPrice);

  
    
}
