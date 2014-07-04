package com.tad.arqdevguide.chp3;

import javax.enterprise.inject.Alternative;

@Alternative
public class HelloWorldAlternative implements IHelloWorld{
	private final String text = "Hello, Alternate World!";

    @Override
	public String getText() {
		return text;
	}
}
