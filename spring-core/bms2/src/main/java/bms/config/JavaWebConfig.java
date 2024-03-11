package bms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
@Configuration
public class JavaWebConfig extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext awc=new AnnotationConfigWebApplicationContext();
		awc.register(AppJavaConfig.class);
		return awc;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
