package com.nick.new_content_calendar;

import com.nick.new_content_calendar.config.ContentCalendarProperties;
import com.nick.new_content_calendar.model.Content;
import com.nick.new_content_calendar.model.Status;
import com.nick.new_content_calendar.model.Type;
import com.nick.new_content_calendar.repository.ContentRepositorySpringData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class NewContentCalendarApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewContentCalendarApplication.class, args);

	}
//	@Bean
//    CommandLineRunner commandLineRunner(ContentRepositorySpringData repository) {
//		return args -> {
//			//insert some data into the database
//
//			Content content = new Content(
//					null,
//					"Hello Chat GPT",
//					"All about Chat GPT",
//					Status.IDEA,
//					Type.VIDEO,
//					LocalDateTime.now(),
//					null,
//					"");
//
//			repository.save(content);
//
//
//		};
//	}
}
