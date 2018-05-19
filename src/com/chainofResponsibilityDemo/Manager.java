package com.chainofResponsibilityDemo;

public class Manager extends Leader{
	public Manager(String name) {
		super(name);
	}
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= 10 ) {
			System.out.println("Manager:"+name+",批准"+request.getName()+"的请假，请假天数："+request.getLeaveDays());
		}else {
			System.out.println("请假天数超过10天，Manager"+name+",无权处理 请假批示，交付GeneralManager处理");
//			super.setSuccessor(new GeneralManager("高明"));
			successor.handleRequest(request);
		}
	}

}
