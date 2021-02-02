package com.example.a1;

import com.example.a1.controller.AlbumJerseyController;
import com.example.a1.controller.ArtistServletController;
import com.example.a1.rest.Album;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class A1Application {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(
                new ArtistServletController(), "/artists","/createArtist","/deleteArtist","/updateArtist");
        return bean;
    }

    public static void main(String[] args) {

        SpringApplication.run(A1Application.class, args);
    }

}
