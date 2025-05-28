package com.mehul.examples.canvas.cmd;
/**
 * @author Mehul Akoliya
 *
 */

import static com.mehul.examples.canvas.util.CanvasCostant.CMD_QUITE;

import com.mehul.examples.canvas.core.Canvas;
import com.mehul.examples.canvas.exception.CanvasException;
import com.mehul.examples.canvas.exception.QuitGameException;

/**
 * Command used for quite the canvas.
 */
public class CommandQuite extends Command{
	
	private Canvas canvas;
	
	private CommandQuite() {
		name = CMD_QUITE;
	}
	
	public CommandQuite(Canvas canvas) {
		this();
		this.canvas = canvas;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void execute() throws CanvasException {
		throw new QuitGameException("Quiting the game!");
	}
	
	@Override
	public Canvas getCanvas() {
		return canvas;
	}

}