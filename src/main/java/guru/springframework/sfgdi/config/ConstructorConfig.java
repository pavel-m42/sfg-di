package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Fhoenix on 2021/03/08.
 */
@ConfigurationProperties("guru")
@ConstructorBinding
public class ConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcUrl;

    public ConstructorConfig(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
