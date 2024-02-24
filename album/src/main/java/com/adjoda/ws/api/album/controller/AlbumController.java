package com.adjoda.ws.api.album.controller;


import com.adjoda.ws.api.album.model.AlbumRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/albums")
public class AlbumController {

    @GetMapping
    public List<AlbumRest> getPhotos() {
        AlbumRest albumRest = AlbumRest.builder()
                .albumId("album ID")
                .userId("1")
                .albumTitle("Photo 1 title")
                .description("Photo 1 description")
                .albumUrl("Photo 1 url")
                .build();

        AlbumRest albumRest2 = AlbumRest.builder()
                .albumId("album ID")
                .userId("1")
                .albumTitle("Photo 2 title")
                .description("Photo 2 description")
                .albumUrl("Photo 2 url")
                .build();

        return List.of(albumRest,albumRest2);
    }
}
