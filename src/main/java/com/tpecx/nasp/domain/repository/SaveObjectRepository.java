package com.tpecx.nasp.domain.repository;

import com.tpecx.nasp.application.request.SaveObjectRequest;
import com.tpecx.nasp.application.response.BaseResponse;

public interface SaveObjectRepository {
    BaseResponse saveObject(SaveObjectRequest request);
    BaseResponse getObject();
}
