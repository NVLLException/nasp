package com.tpecx.nasp.domain.repository;

import com.tpecx.nasp.application.request.BaseRequest;
import com.tpecx.nasp.application.request.SaveDirectoryRequest;
import com.tpecx.nasp.application.response.BaseResponse;
import com.tpecx.nasp.domain.entity.NaspDirectory;

public interface DirectoryRepository {
    BaseResponse saveDirectory(NaspDirectory directory);
    BaseResponse getDirectory();
}