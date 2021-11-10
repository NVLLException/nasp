package com.tpecx.nasp.application.request;

import com.tpecx.nasp.application.dto.NaspDirectoryDTO;
import com.tpecx.nasp.domain.entity.NaspDirectory;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveDirectoryRequest extends BaseRequest{
    @NonNull
    private NaspDirectoryDTO directory;
}