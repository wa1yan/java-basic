package com.waiyanhtet.annotation.utils;

import java.lang.reflect.Method;

import com.waiyanhtet.annotation.business.ActionImpl;
import com.waiyanhtet.annotation.meta.DefaultMessage;

public class ActionExecutor {

	static void execute(Action action, String message) throws Exception {

		if(null == message ){
			Method invoke = action.getClass().getMethod("invoke", String.class);
			
			if(null != invoke) {
				DefaultMessage defaultMessage = invoke.getAnnotation(DefaultMessage.class);

				if(defaultMessage != null) {
					action.invoke(defaultMessage.value());
				}
			}
		} else {
			action.invoke(message);	
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("This is feature xyz branch.");
		Action myAction = new ActionImpl();
		execute(myAction, "Message from parameter");
		execute(myAction, null);
		System.out.println("This is feature xyz branch code from github.");
	}
}
