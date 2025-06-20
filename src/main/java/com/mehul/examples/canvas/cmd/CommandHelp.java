package com.mehul.examples.canvas.cmd;
/**
 * @author Mehul Akoliya
 *
 */

import static com.mehul.examples.canvas.util.CanvasCostant.CMD_HELP;

import com.mehul.examples.canvas.core.Canvas;
import com.mehul.examples.canvas.exception.CanvasException;

/**
 * Help command
 */
public class CommandHelp extends Command {
	
	private Canvas canvas;

	private CommandHelp() {
		name = CMD_HELP;
	}
	public CommandHelp(Canvas canvas) {
		this();
		this.canvas = canvas;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void execute() throws CanvasException {
		printHelp();
	}
	
	@Override
	public Canvas getCanvas() {
		return canvas;
	}
	
	private void printHelp() {
		System.out.println("");
		System.out.println("************ OPTIONS *************");
		System.out.println("C w h - Create a new canvas of width w and height h.");
		System.out.println("L x1 y1 x2 y2 - Create a new line from (x1,y1) to (x2,y2).");
		System.out.println("R x1 y1 x2 y2 - Create a new rectangle, whose upper left corner is (x1,y1) and lower right corner is (x2,y2).");
		System.out.println("B x y c - Fill the area connected to (x,y) with 'color' c.");
		System.out.println("X - Clear the canvas.");
		System.out.println("H - Help.");
		System.out.println("Q - Quit the program.");
		System.out.println("**********************************");
		System.out.println();
	}

}
