package com.tad.arqdevguide.chp3;

public class HelloWorld implements IHelloWorld {
	private final String text = "Hello, World!";

	@Override
    public String getText() {
		return text;
	}
}
