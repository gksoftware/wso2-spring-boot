package demo;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;

/**
 * Created by gordon on 4/3/16.
 */
public class MyUserInfoRestTemplateCustomizer implements UserInfoRestTemplateCustomizer {

    @Override
    public void customize(OAuth2RestTemplate template) {
        template.setAuthenticator(new MyOAuth2RequestAuthenticator());
    }

}