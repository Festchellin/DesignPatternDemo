package com.commandPatternDemo;

public class CommandPatternClient {

	public static void main(String[] args) {
		Television television = new Television();
		TVOpenCommand openCommand = new TVOpenCommand(television);
		TVCloseCommand closeCommand = new TVCloseCommand(television);
		TVChangeChannelCommand changeChannelCommand = new TVChangeChannelCommand(television);
		Controller tvController = new Controller(openCommand, closeCommand, changeChannelCommand);
		tvController.open();
		tvController.changeChannel();
		tvController.close();

	}

}
