package com.tpecx.nasp.domain.repository;

import com.tpecx.nasp.api.response.BaseResponse;
import com.tpecx.nasp.domain.entity.NaspDirectory;

public interface DirectoryRepository {
    BaseResponse saveDirectory(NaspDirectory directory);
    BaseResponse getDirectory();
}