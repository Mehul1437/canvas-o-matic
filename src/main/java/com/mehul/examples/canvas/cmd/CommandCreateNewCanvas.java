package com.mehul.examples.canvas.cmd;
/**
 * @author Mehul Akoliya
 *
 */

import static com.mehul.examples.canvas.util.CanvasCostant.CMD_CREATE_CANVAS;

import com.mehul.examples.canvas.core.Canvas;
import com.mehul.examples.canvas.exception.CanvasException;

/**
 * Command used by the canvas for creating a new Canvas
 */
public class CommandCreateNewCanvas extends Command{
	
	private int weight;
	private int height;
	private Canvas canvas;
	
	private CommandCreateNewCanvas() {
		name = CMD_CREATE_CANVAS;
	}
	
	public CommandCreateNewCanvas(int w, int h) {
		this();
		weight = w;
		height = h;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void execute() throws CanvasException {
		canvas = new Canvas(weight, height);		
	}
	
	@Override
	public Canvas getCanvas() {
		return canvas;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
