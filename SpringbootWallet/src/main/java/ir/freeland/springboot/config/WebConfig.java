package ir.freeland.springboot.config;

import ir.freeland.springboot.annotation.MilitaryStatusValidator;
import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.context.support.ResourceBundleThemeSource;
import org.springframework.util.unit.DataSize;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.theme.CookieThemeResolver;
import org.springframework.web.servlet.theme.ThemeChangeInterceptor;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration


public class WebConfig implements WebMvcConfigurer {

    @Bean
    public MilitaryStatusValidator militaryStatusValidator() {

        return new MilitaryStatusValidator();
    }
	
	@Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/")
            .setViewName("index");
    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofBytes(10000000L));
        factory.setMaxRequestSize(DataSize.ofBytes(10000000L));
        return factory.createMultipartConfig();
    }

    @Bean
    ViewResolver viewResolver() {
        final InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/view/");
        bean.setSuffix(".jsp");
        bean.setOrder(2);
        return bean;
    }

    /** Static resource locations including themes*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
            .addResourceLocations("/", "/resources/")
            .setCachePeriod(3600)
            .resourceChain(true)
            .addResolver(new PathResourceResolver());
    }

    /** BEGIN theme configuration */
    @Bean
    ResourceBundleThemeSource themeSource() {
        ResourceBundleThemeSource themeSource = new ResourceBundleThemeSource();
        themeSource.setDefaultEncoding("UTF-8");
        themeSource.setBasenamePrefix("themes.");
        return themeSource;
    }

    @Bean
    CookieThemeResolver themeResolver() {
        CookieThemeResolver resolver = new CookieThemeResolver();
        resolver.setDefaultThemeName("default");
        resolver.setCookieName("example-theme-cookie");
        return resolver;
    }

    @Bean
    ThemeChangeInterceptor themeChangeInterceptor() {
        ThemeChangeInterceptor interceptor = new ThemeChangeInterceptor();
        interceptor.setParamName("theme");
        return interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(themeChangeInterceptor());
    }

    /** END theme configuration */

    @Bean
    BeanNameViewResolver beanNameViewResolver(){
        BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
        beanNameViewResolver.setOrder(1);
        return beanNameViewResolver;
    }

    @Bean
    View sample1() {
        return new JstlView("/WEB-INF/view01/sample1.jsp");
    }

    @Bean
    View sample2() {
        return new JstlView("/WEB-INF/view02/sample2.jsp");
    }

    @Bean
    View sample3(){
        return new JstlView("/WEB-INF/view03/sample3.jsp");
    }
    
    @Bean    
    View sample4(){
        return new JstlView("/WEB-INF/view04/sample4.jsp");
    }
    
    @Bean    
    View sample6(){
        return new JstlView("/WEB-INF/view06/sample6.jsp");
    }
    
    
    @Bean    
    View sample7(){
        return new JstlView("/WEB-INF/view07/sample7.jsp");
    }
    
    @Bean    
    View sample8(){
        return new JstlView("/WEB-INF/view08/sample8.jsp");
    }
    
    @Bean    
    View sample9(){
        return new JstlView("/WEB-INF/view09/sample9.jsp");
    }
    
    @Bean    
    View sample10(){
        return new JstlView("/WEB-INF/view10/sample10.jsp");
    }
    
    @Bean    
    View sample11(){
        return new JstlView("/WEB-INF/view11/sample11.jsp");
    }
    
    @Bean    
    View sample12(){
        return new JstlView("/WEB-INF/view12/sample12.jsp");
    }
    
    @Bean    
    View sample13(){
        return new JstlView("/WEB-INF/view13/sample13.jsp");
    }
    
    @Bean    
    View sample14(){
        return new JstlView("/WEB-INF/view14/sample14.jsp");
    }
    
    @Bean    
    View sample15(){
        return new JstlView("/WEB-INF/view15/sample15.jsp");
    }
    
    
    @Bean    
    View sample16(){
        return new JstlView("/WEB-INF/view16/sample16.jsp");
    }
    


    /**
     * Spring Boot allows configuring Content Negotiation using properties
     */
    @Override
    public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
            .parameterName("mediaType")
            .ignoreAcceptHeader(false)
            .useRegisteredExtensionsOnly(false)
            .defaultContentType(MediaType.APPLICATION_JSON)
            .mediaType("xml", MediaType.APPLICATION_XML)
            .mediaType("json", MediaType.APPLICATION_JSON);
    }

    @Bean
    View resultuserbutton(){
        return new JstlView("/WEB-INF/view01/resultuserbutton.jsp");
    }

    @Bean
    View resultadminbutton(){
        return new JstlView("/WEB-INF/view01/resultadminbutton.jsp");
    }

    @Bean
    View resultaddnewperson(){
        return new JstlView("/WEB-INF/view04/resultaddnewperson.jsp");
    }

    @Bean
    View resultfindperson(){
        return new JstlView("/WEB-INF/view06/resultfindperson.jsp");
    }

    @Bean
    View resultupdateperson(){
        return new JstlView("/WEB-INF/view07/resultupdateperson.jsp");
    }

    @Bean
    View resultdeleteperson(){
        return new JstlView("/WEB-INF/view08/resultdeleteperson.jsp");
    }

    @Bean
    View resultaddaccount(){
        return new JstlView("/WEB-INF/view09/resultaddaccount.jsp");
    }

    @Bean
    View resultfindaccount(){
        return new JstlView("/WEB-INF/view10/resultfindaccount.jsp");
    }

    @Bean
    View resultupdateaccount(){
        return new JstlView("/WEB-INF/view11/resultupdateaccount.jsp");
    }


    @Bean
    View resultdeleteaccount(){
        return new JstlView("/WEB-INF/view12/resultdeleteaccount.jsp");
    }


    @Bean
    View resultdepositaccount(){
        return new JstlView("/WEB-INF/view13/resultdepositaccount.jsp");
    }

    @Bean
    View resultwithdrawaccount(){
        return new JstlView("/WEB-INF/view14/resultwithdrawaccount.jsp");
    }

    @Bean
    View resulttransfer(){
        return new JstlView("/WEB-INF/view15/resulttransfer.jsp");
    }

    @Bean
    View resulttransactions(){
        return new JstlView("/WEB-INF/view16/resulttransactions.jsp");
    }

}
