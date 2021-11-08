package com.tpecx.nasp.application.request;

import com.tpecx.nasp.domain.entity.NaspDirectory;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveDirectoryRequest extends BaseRequest{
    private NaspDirectory directory;
}