package com.tpecx.nasp.application.request;

import com.tpecx.nasp.domain.entity.NaspObject;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveObjectRequest extends BaseRequest{
    private NaspObject object;
}
