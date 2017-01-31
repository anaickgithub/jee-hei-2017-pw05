package hei.tp05.web.config;

import hei.tp05.contract.facade.ClientWS;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.inject.Inject;
import javax.xml.ws.Endpoint;

/**
 * Created by Anaïck on 31/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "hei.tp05.web.service")
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class WSConfig {

    @Inject
    private Bus cxfBus;

    @Inject
    private ClientWS clientws;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(cxfBus, clientws);
        endpoint.publish("/client");
        return endpoint;
    }
}
