package com.tpecx.nasp.application.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class NaspObjectDTO {
    private String id;
    private String directoryId;
    @NonNull
    private String name;
    @NonNull
    private Long length;
    @NonNull
    private byte[] content;
}
