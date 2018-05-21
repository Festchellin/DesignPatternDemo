package com.commandPatternDemo;

public class TVChangeChannelCommand extends AbstractCommand {
	private Television television;

	@Override
	public void execute() {
		television.changeChannel();
	}

	public TVChangeChannelCommand(Television television) {
		super();
		this.television = television;
	}

}
