package com.tpecx.nasp.api.response;

import com.tpecx.nasp.domain.entity.NaspDirectory;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class GetDirectoryResponse extends BaseResponse{
    private List<NaspDirectory> directoryList;
}
