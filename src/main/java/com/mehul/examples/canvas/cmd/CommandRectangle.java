package com.mehul.examples.canvas.cmd;

/**
 * @author Mehul Akoliya
 *
 */

import static com.mehul.examples.canvas.util.CanvasCostant.CMD_HELP;
import static com.mehul.examples.canvas.util.CanvasCostant.CMD_RECTANGLE;

import com.mehul.examples.canvas.core.Canvas;
import com.mehul.examples.canvas.exception.CanvasException;
import com.mehul.examples.canvas.exception.CanvasNotYetCreatedException;

/**
 * Represents the command for drawing a rectangle in the canvas.
 * A rectangle, whose upper left corner is (x1,y1) and lower right corner is (x2,y2)
 */
public class CommandRectangle extends Command{
	
	private Canvas canvas;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public CommandRectangle() {
		name = CMD_RECTANGLE;
	}
	
	public CommandRectangle(int x1, int y1, int x2, int y2, Canvas canvas) {
		this();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.canvas = canvas;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void execute() throws CanvasException {
		if(canvas == null){
			throw new CanvasNotYetCreatedException("First create a new Canvas using 'C' command. Insert '"+CMD_HELP+"' for Help.\n");
		}
		canvas.insertRectangle(this);
	}
	
	@Override
	public Canvas getCanvas() {
		return canvas;
	}
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public String toString() {
		String rv = "CommandLine[("+x1+", "+y1+"), ("+x2+", "+y2+")]";
		return rv;
	}
	
}