package com.org.task_management.checker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseEnvChecker implements CommandLineRunner {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUser;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("🔍 Database URL: " + dbUrl);
        System.out.println("👤 Database Username: " + dbUser);
    }
}

