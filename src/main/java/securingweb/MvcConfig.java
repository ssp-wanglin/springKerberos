package securingweb;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Validator getValidator() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}