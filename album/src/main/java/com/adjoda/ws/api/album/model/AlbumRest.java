package com.adjoda.ws.api.album.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class AlbumRest {
    private String albumId;
    private String userId;
    private String albumTitle;
    private String description;
    private String albumUrl;
}
