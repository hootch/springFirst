package hello.core.discount;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP는 10%할인이 적용돼야함")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
        }

        @Test
        @DisplayName("no VIP no discount")
        void vip_x(){
            //g
            Member member = new Member(2l, "notVIP", Grade.BASIC);

            //w
            int discount = discountPolicy.discount(member, 10000);
            //t
            Assertions.assertThat(discount).isEqualTo(0);

        }
    

}
