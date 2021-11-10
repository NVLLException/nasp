package com.tpecx.nasp.application.request;

import com.tpecx.nasp.application.dto.NaspObjectDTO;
import com.tpecx.nasp.domain.entity.NaspObject;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveObjectRequest extends BaseRequest{
    @NonNull
    private NaspObjectDTO object;
}
