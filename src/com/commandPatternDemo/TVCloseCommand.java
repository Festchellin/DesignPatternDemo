package com.commandPatternDemo;

public class TVCloseCommand extends AbstractCommand {
	private Television television;

	@Override
	public void execute() {
		television.close();
	}

	public TVCloseCommand(Television television) {
		super();
		this.television = television;
	}

}
