package controller;

import java.util.Stack;

@SuppressWarnings("serial")
public class UndoRedoStack<E> extends Stack<E> {
	@SuppressWarnings("rawtypes")
	private Stack undoStack;
	@SuppressWarnings("rawtypes")
	private Stack redoStack;
	
	//post:constructs an empty UndoRedoStack
	@SuppressWarnings("rawtypes")
	public UndoRedoStack() {
		undoStack = new Stack();
		redoStack = new Stack();
	}
	
	//post: pushes and returns the given value on top of the stack
	@SuppressWarnings("unchecked")
	public E push(E value) {
		super.push(value);
		undoStack.push("push");
		redoStack.clear();
		return value;
	}

	//post: pops and returns the value at the top of the stack
	@SuppressWarnings("unchecked")
	public E pop() {
		E value = super.pop();
		undoStack.push(value);
		undoStack.push("pop");
		redoStack.clear();
		return value;
	}
	
	//post: returns whether or not an undo can be done
	public boolean canUndo() {
		return !undoStack.isEmpty();
	}
	
	@SuppressWarnings("unchecked")
	public void undo() {
		if(!canUndo()) {
			throw new IllegalStateException();
		}
		Object action = undoStack.pop();
		if (action.equals("push")) {
			E value = super.pop();
			redoStack.push(value);
			redoStack.push("push");
		}
		else {
			E value = (E)undoStack.pop();
			super.push(value);
			redoStack.push("pop");
		}
	}
	
	//post: returns whether or not a redo can be done 
	public boolean canRedo() {
		return !redoStack.isEmpty();
	}
		
	//pre: canRedo() (throws IllegalStateException if not)
	//post: redoes the last undone operation
	@SuppressWarnings("unchecked")
	public void redo() {
		if(!canRedo()) {
			throw new IllegalStateException();
		}
		Object action = redoStack.pop();
		if(action.equals("push")) {
			E value = (E) redoStack.pop();
			super.push(value);
			undoStack.push("push");
		}
		else {
			E value = super.pop();
			undoStack.push(value);
			undoStack.push("pop");
		}
	}	
}