
package com.greedy.thunderbolts.model.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

package com.greedy.thunderbolts.model.dto;

import lombok.Data;

@Data
public class DeliveryDTO {
	
	    private int deliveryNo;
	    private int ordersNo;
	    private int postNo;
	    private String deliDiv;
	    private String postTel;
	    private String postReceiver;
	    private String postAddsub;
	    private String postRequest;
	    private String deliveryCompany;
	    private String deliveryNum;
	    private String postAddmain;
	    private String postDiv;

}
