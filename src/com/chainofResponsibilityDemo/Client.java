package com.chainofResponsibilityDemo;

public class Client {

	public static void main(String[] args) {
		LeaveRequest request = new LeaveRequest("张三", 31);
		Director director = new Director("王振");
		Manager manager = new Manager("刘莉莉");
		GeneralManager generalManager = new GeneralManager("高明");
		director.setSuccessor(manager);
		manager.setSuccessor(generalManager);
		director.handleRequest(request);
	}

}
