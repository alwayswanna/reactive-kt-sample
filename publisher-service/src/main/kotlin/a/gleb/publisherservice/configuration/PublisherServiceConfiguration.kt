package a.gleb.publisherservice.configuration

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PublisherServiceConfiguration {

    @Bean
    fun converter() : Jackson2JsonMessageConverter{
        return Jackson2JsonMessageConverter()
    }
}