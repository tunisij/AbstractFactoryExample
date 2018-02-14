package com.tunisij.factory;

import com.tunisij.button.Word90Button;
import com.tunisij.panel.Word90Panel;
import com.tunisij.textbox.Word90TextBox;

public class Word90Factory extends AbstractComponentFactory {
	
	private static int instances = 0;
	private static Word90Factory word90Factory = new Word90Factory();
	
	private Word90Factory() {}
	
	public static Word90Factory getFactory() {
		if (instances++ < 2) {
			return word90Factory;
		} else {
			System.out.println("Maximum Word90 hit");
			return null;
		}
	}

	@Override
	public void testButton() {
		new Word90Button().doButton();
	}

	@Override
	public void testPanel() {
		new Word90Panel().doPanel();
	}

	@Override
	public void testTextBox() {
		new Word90TextBox().doTextBox();
	}
	
}
