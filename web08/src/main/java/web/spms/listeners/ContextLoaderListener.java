package web.spms.listeners;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebListener
public class ContextLoaderListener implements ServletContextListener {

	static ClassPathXmlApplicationContext applicationContext;

	public static ClassPathXmlApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			applicationContext = new ClassPathXmlApplicationContext("beans.xml");
			for (String name : applicationContext.getBeanDefinitionNames()) {
				System.out.println(name);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
