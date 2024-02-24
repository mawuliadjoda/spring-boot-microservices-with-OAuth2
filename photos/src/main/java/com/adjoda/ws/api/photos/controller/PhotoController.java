package com.adjoda.ws.api.photos.controller;



import com.adjoda.ws.api.photos.model.PhotoRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/photos")
public class PhotoController {

    @GetMapping
    public List<PhotoRest> getPhotos() {
        PhotoRest photoRest = PhotoRest.builder()
                .albumId("album ID")
                .photoId("1")
                .userId("1")
                .photoTitle("Photo 1 title")
                .description("Photo 1 description")
                .photoUrl("Photo 1 url")
                .build();

        PhotoRest photoRest2 = PhotoRest.builder()
                .albumId("album ID")
                .photoId("2")
                .userId("1")
                .photoTitle("Photo 2 title")
                .description("Photo 2 description")
                .photoUrl("Photo 2 url")
                .build();

        return List.of(photoRest,photoRest2);
    }
}
