package net.winhistory.forum.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import net.winhistory.forum.web.mapper.ObjectIdMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class RestConfiguration {
    @Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.build();

        objectMapper.registerModule(ObjectIdMapper.getModule());

        objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);

        return objectMapper;
    }
}
