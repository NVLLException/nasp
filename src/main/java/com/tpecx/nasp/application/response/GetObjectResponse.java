package com.tpecx.nasp.application.response;

import com.tpecx.nasp.domain.entity.NaspObject;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GetObjectResponse extends BaseResponse{
    private NaspObject naspObject;
}
