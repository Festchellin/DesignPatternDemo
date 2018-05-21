package com.commandPatternDemo;

public class TVOpenCommand extends AbstractCommand {
	private Television television;

	public TVOpenCommand(Television television) {
		super();
		this.television = television;
	}

	@Override
	public void execute() {
		television.open();
	}
}
