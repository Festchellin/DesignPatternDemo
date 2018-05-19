package com.chainofResponsibilityDemo;

public class Director extends Leader{
	public Director(String name) {
		super(name);
	}
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= 3 ) {
			System.out.println("Director"+name+",批准"+request.getName()+"的请假，请假天数："+request.getLeaveDays());
		}else {
			System.out.println("请假天数超过3天，Director"+name+",无权处理 请假批示，交付Manager处理");
//			super.setSuccessor(new Manager("刘莉莉"));
			successor.handleRequest(request);
		}
		
	}

}
