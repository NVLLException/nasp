package com.tpecx.nasp.infrastructure;

import com.tpecx.nasp.api.response.BaseResponse;
import com.tpecx.nasp.domain.entity.NaspObject;
import com.tpecx.nasp.domain.repository.ObjectRepository;

public class ObjectRepositoryImpl implements ObjectRepository {

    @Override
    public BaseResponse saveObject(NaspObject object) {
        return null;
    }

    @Override
    public BaseResponse getObject(String objectId) {
        return null;
    }
}
