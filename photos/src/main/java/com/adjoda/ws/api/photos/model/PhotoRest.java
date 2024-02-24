package com.adjoda.ws.api.photos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class PhotoRest {
    private String photoId;
    private String albumId;
    private String userId;
    private String photoTitle;
    private String description;
    private String photoUrl;
}
