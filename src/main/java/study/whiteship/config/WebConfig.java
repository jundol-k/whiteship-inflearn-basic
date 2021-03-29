package study.whiteship.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 추가적으로 설정을 더 하고싶은 경우에는...
@Configuration
public class WebConfig implements WebMvcConfigurer {
    // webMvcConfigurer에 있는 콜백 구현하면 된다.
}