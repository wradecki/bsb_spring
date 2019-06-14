package pl.postproce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.config.TaskExecutorFactoryBean;

@Configuration
@EnableAsync
public class ConfigPostProcessors {

    @Bean
    public TaskExecutorFactoryBean taskExecutor(){
        return new TaskExecutorFactoryBean();
    }

}
