package com.tunisij.factory;

import com.tunisij.button.Word00Button;
import com.tunisij.panel.Word00Panel;
import com.tunisij.textbox.Word00TextBox;

public class Word00Factory extends AbstractComponentFactory {
	
	private static int instances = 0;
	private static Word00Factory word00Factory = new Word00Factory();
	
	private Word00Factory() {}
	
	public static Word00Factory getFactory() {
		if (instances++ < 2) {
			return word00Factory;
		} else {
			System.out.println("Maximum Word00 hit");
			return null;
		}
	}

	@Override
	public void testButton() {
		new Word00Button().doButton();
	}

	@Override
	public void testPanel() {
		new Word00Panel().doPanel();
	}

	@Override
	public void testTextBox() {
		new Word00TextBox().doTextBox();
	}
	
}
