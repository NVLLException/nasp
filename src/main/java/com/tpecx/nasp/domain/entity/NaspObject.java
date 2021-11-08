package com.tpecx.nasp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NaspObject {
    private String id;
    private String directoryId;
    private String name;
    private String length;
    private byte[] content;
}
