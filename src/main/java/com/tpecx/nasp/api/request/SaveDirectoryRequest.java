package com.tpecx.nasp.api.request;

import com.tpecx.nasp.application.dto.NaspDirectoryDTO;
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