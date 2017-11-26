package controller;

public interface Command {
	
	public abstract void excecute();
	
	public abstract void undo();

}
