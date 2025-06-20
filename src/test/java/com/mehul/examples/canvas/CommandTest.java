package com.mehul.examples.canvas;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;

import com.mehul.examples.canvas.cmd.factory.CommandFactory;
import com.mehul.examples.canvas.cmd.factory.CommandFactoryImpl;
import com.mehul.examples.canvas.core.Canvas;
import com.mehul.examples.canvas.exception.CanvasException;
import com.mehul.examples.canvas.util.CanvasCostant;

public abstract class CommandTest {
	
	protected static final transient Log logger = LogFactory.getLog(CommandRectangleTest.class);
	protected Canvas canvas;
	protected int width = 20;
	protected int height = 4;
	protected CommandFactory commandFactory;

	@Before
	public void setUp() {
		commandFactory = new CommandFactoryImpl();
		try {
			canvas = new Canvas(width, height);
		} catch (CanvasException e) {
			logger.error("Exception initializing Canvas: " + e.getMessage(), e);
		}
	}

	@After
	public void drillDown() {
		canvas.printCanvas();
		canvas.clearCanvas();
	}

	/**
	 * Counts the 'pixels' present in the canvas and compare it with the expected value.
	 */
	protected void assertExpected(Canvas canvas, String pixels, int expected) throws CanvasException {
		String mat[][] = canvas.getMatrix();
		int found = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				// count all the 'x' (or 'o') present in the matrix.
				if (mat[i][j].equals(pixels)) {
					found++;
				}
			}
		}

		assertEquals(expected, found);
	}
	
	protected void assertExpected(Canvas canvas, int expected) throws CanvasException {
		assertExpected(canvas, CanvasCostant.PIXEL, expected);
	}
	
}
