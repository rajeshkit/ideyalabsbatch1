package org.mtrs.config;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class AppWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	private static final Logger logger=LoggerFactory.getLogger(AppWebInitializer.class);
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		logger.info("dispatcher servlet is load java bean config class");
		return new Class[] {JavaConfigApplicationContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		logger.info("the request reaches to a dispatcher servlet");
		return new String[]{"/"};
	}

}
