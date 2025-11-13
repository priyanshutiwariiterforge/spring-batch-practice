package com.example.springbatchpractice.writer;

import com.example.springbatchpractice.model.User;
import com.example.springbatchpractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class UserDbWriter{



    @Bean
    public RepositoryItemWriter<User> writer(UserRepository userRepository) {
        RepositoryItemWriter<User> writer = new RepositoryItemWriter<>();
        writer.setRepository(userRepository);
        writer.setMethodName("save");
        return writer;
    }
}