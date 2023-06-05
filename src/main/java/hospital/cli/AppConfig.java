package hospital.cli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig is a Spring configuration class that defines beans for VisitorService and VisitorRepository.
 * These beans are used for dependency injection within the application.
 */
@Configuration
public class AppConfig {

    /**
     * Provides a singleton bean of the VisitorService interface.
     * The VisitorService bean is used to register visitors and get a report of all visitors.
     *
     * @return an instance of the VisitorService interface.
     */
    @Bean
    public VisitorService visitorService() {
        return new VisitorServiceImpl(visitorRepository());
    }

    /**
     * Provides a singleton bean of the VisitorRepository interface.
     * The VisitorRepository bean is used to save visitors and retrieve all visitors.
     *
     * @return an instance of the VisitorRepository interface.
     */
    @Bean
    public VisitorRepository visitorRepository() {
        return new VisitorRepositoryImpl();
    }
}