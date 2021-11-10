package com.tpecx.nasp.domain.repository;

import com.tpecx.nasp.api.response.BaseResponse;
import com.tpecx.nasp.domain.entity.NaspObject;

public interface ObjectRepository {
    BaseResponse saveObject(NaspObject object);
    BaseResponse getObject(String objectId);
}