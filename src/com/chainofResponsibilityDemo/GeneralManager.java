package com.chainofResponsibilityDemo;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() <= 30 ) {
			System.out.println("GeneralManager:"+name+",批准"+request.getName()+"的请假，请假天数："+request.getLeaveDays());
		}else {
			System.out.println("请假天数超过30天，GeneralManager"+name+"不批准请假，并向你说出了：你可以卷铺盖走人了！");
		}
	}

}
