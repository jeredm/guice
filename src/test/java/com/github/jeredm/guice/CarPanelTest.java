package com.github.jeredm.guice;

import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.mock.MockApplication;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.github.jeredm.guice.service.ICarService;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @author Jered Myers
 * @since May 15, 2017
 */
public class CarPanelTest
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new GuiceApp());
	}

	@Test
	public void testInjectedList()
	{
		tester.startComponentInPage(new CarPanel("carPanel"));
		tester.assertLabel("carPanel:carView:0:make", "Chevy");
	}

	private class GuiceApp extends MockApplication
	{
		@Override
		public void init()
		{
			super.init();
			Injector injector = Guice.createInjector(new Module()
			{
				@Override
				public void configure(Binder binder)
				{
					binder.bind(ICarService.class).to(MockCarService.class);
				}
			});
			getComponentInstantiationListeners().add(new GuiceComponentInjector(this, injector));
			injector.injectMembers(this);
		}
	}

}
