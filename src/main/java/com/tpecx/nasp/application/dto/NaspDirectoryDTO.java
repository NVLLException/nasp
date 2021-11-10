package com.tpecx.nasp.application.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class NaspDirectoryDTO {
    private String id;
    private String parentDirectoryId;
    @NonNull
    private String name;
}