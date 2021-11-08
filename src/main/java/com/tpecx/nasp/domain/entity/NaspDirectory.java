package com.tpecx.nasp.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NaspDirectory {
    private String id;
    private String name;
}
