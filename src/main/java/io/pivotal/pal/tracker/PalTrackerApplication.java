package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PalTrackerApplication {

    @Bean
    public TimeEntryRepository timeEntryRepository(JdbcTemplate jdbcTemplate) {
        return new JdbcTimeEntryRepository(jdbcTemplate);
    }

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}
