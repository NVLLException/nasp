package com.tpecx.nasp.api.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class GetObjectRequest extends BaseRequest{
    @NonNull
    private String objectId;
}
