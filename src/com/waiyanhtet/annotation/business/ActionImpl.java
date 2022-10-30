package com.waiyanhtet.annotation.business;

import com.waiyanhtet.annotation.meta.DefaultMessage;
import com.waiyanhtet.annotation.utils.Action;

public class ActionImpl implements Action {

	@Override
	@DefaultMessage(value="This is default message for Action.")
	public void invoke(String message){
		System.out.println("Action : " + message);
	}
}
