package hei.tp05.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Anaïck on 31/01/2017.
 */
@Configuration
@ComponentScan
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class WSConfig {
}
