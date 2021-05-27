package com.crypt.blog.response;

import com.crypt.blog.entities.Post;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class PostListResponse extends Response<List<Post>> {
    @JsonProperty("current_page")
    private int currentPage;

    @JsonProperty("first_page_url")
    private String firstPageUrl;

    @JsonProperty("from")
    private int from;

    @JsonProperty("last_page")
    private int lastPage;

    @JsonProperty("last_page_url")
    private String lastPageUrl;

    @JsonProperty("next_page_url")
    private String nextPageUrl;

    @JsonProperty("path")
    private String path;

    @JsonProperty("per_page")
    private int perPage;

    @JsonProperty("prev_page_url")
    private String prevPageUrl;

    @JsonProperty("to")
    private int to;

    @JsonProperty("total")
    private int total;
}
