package com.tunisij.factory;

import com.tunisij.button.Word10Button;
import com.tunisij.panel.Word10Panel;
import com.tunisij.textbox.Word10TextBox;

public class Word10Factory extends AbstractComponentFactory {
	
	private static int instances = 0;
	private static Word10Factory word10Factory = new Word10Factory();
	
	private Word10Factory() {}
	
	public static Word10Factory getFactory() {
		if (instances++ < 2) {
			return word10Factory;
		} else {
			System.out.println("Maximum Word10 hit");
			return null;
		}
	}

	@Override
	public void testButton() {
		new Word10Button().doButton();
	}

	@Override
	public void testPanel() {
		new Word10Panel().doPanel();
	}

	@Override
	public void testTextBox() {
		new Word10TextBox().doTextBox();
	}

}
