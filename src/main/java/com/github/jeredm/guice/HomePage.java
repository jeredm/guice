package com.github.jeredm.guice;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * The home page for the application.
 * 
 * @author Jered Myers
 * @since May 15, 2017
 */
public class HomePage extends WebPage
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param parameters
	 *            any arguments
	 */
	public HomePage(final PageParameters parameters)
	{
		super(parameters);

		add(new CarPanel("carPanel"));
	}
}
