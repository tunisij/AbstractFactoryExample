package com.tunisij.factory;

import com.tunisij.button.Word18Button;
import com.tunisij.panel.Word18Panel;
import com.tunisij.textbox.Word18TextBox;

public class Word18Factory extends AbstractComponentFactory {

	private static int instances = 0;
	private static Word18Factory word18Factory = new Word18Factory();
	
	private Word18Factory() {}
	
	public static Word18Factory getFactory() {
		if (instances++ < 2) {
			return word18Factory;
		} else {
			System.out.println("Maximum Word18 hit");
			return null;
		}
	}
	
	@Override
	public void testButton() {
		new Word18Button().doButton();
	}

	@Override
	public void testPanel() {
		new Word18Panel().doPanel();
	}

	@Override
	public void testTextBox() {
		new Word18TextBox().doTextBox();
	}
	
}
