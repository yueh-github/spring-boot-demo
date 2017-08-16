package caimao;

import caimao.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author hutao <胡涛, hutao@coolqi.com>
 * @version v1.0
 * @project test-spring-boot-example
 * @Description
 * @encoding UTF-8
 * @date 2016/11/27
 * @time 下午3:33
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Configuration
@Slf4j
public class CustomMvcConfiguration extends WebMvcConfigurerAdapter {

    /**
     * 添加拦截器配置
     *
     * @param registry
     */
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor())
                .excludePathPatterns(
                        "/index"
                );

        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/save", "detail");
    }
}
