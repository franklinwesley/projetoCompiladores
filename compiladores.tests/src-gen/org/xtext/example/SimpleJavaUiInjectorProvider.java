/*
 * generated by Xtext
 */
package org.xtext.example;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SimpleJavaUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.ui.internal.SimpleJavaActivator.getInstance().getInjector("org.xtext.example.SimpleJava");
	}
	
}