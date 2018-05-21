package com.commandPatternDemo;

public class Controller {
	private TVOpenCommand openCommand;
	private TVCloseCommand closeCommand;
	private TVChangeChannelCommand changeChannelCommand;

	public Controller(TVOpenCommand openCommand, TVCloseCommand closeCommand,
			TVChangeChannelCommand changeChannelCommand) {
		super();
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeChannelCommand = changeChannelCommand;
	}

	public void open() {
		openCommand.execute();
	}

	public void close() {
		closeCommand.execute();
	}

	public void changeChannel() {
		changeChannelCommand.execute();
	}
}
