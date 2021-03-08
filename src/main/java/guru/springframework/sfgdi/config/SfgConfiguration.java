package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Fhoenix on 2021/03/08.
 */
@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {

    private String username;
    private String password;
    private String jdbcUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
