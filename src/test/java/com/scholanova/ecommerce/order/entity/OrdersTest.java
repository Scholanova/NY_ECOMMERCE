package com.scholanova.ecommerce.order.entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrdersTest {

    @Test
    public void checkout_ShouldSetTheDateAndTimeOfTodayInTheOrder(){
        //given
        Orders order = new Orders();
        Calendar calendar = Calendar.getInstance();
        java.util.Date dateOfToday = calendar.getTime();
        java.sql.Date date = new java.sql.Date(dateOfToday.getTime());
        //when
        order.checkout();
        //then
        // assertThat(order.getIssueDate()).isEqualTo(date);
    }

    @Test
    public void checkout_ShouldSetOrderStatusToPending(){

    }

    @Test
    public void checkout_ShouldThrowNotAllowedExceptionIfStatusIsClosed(){

    }

    @Test
    public void checkout_ShouldThrowIllegalArgExceptionIfCartTotalItemsQuantityIsZERO(){

    }

    @Test
    public void setCart_ShouldThrowNotAllowedExceptionIfStatusIsClosed(){

    }

    @Test
    public void createOrder_ShouldSetTheCartInTheOrder(){

    }

    @Test
    public void createOrder_ShouldSetStatusToCreated(){

    }

    @Test
    public void getDiscount_shouldReturnZEROIFCartTotalPriceIsLessThan100(){

    }

    @Test
    public void getDiscount_shouldReturn5percentIfCartTotalPriceIsMoreOrEqual100(){

    }

    @Test
    public void getOrderPrice_shouldReturnTotalPriceWithDiscount(){

    }

    @Test
    public void close_ShouldSetStatusToClose(){

    }

}