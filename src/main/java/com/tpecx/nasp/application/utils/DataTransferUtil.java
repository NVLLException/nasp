package com.tpecx.nasp.application.utils;

import com.tpecx.nasp.application.dto.NaspDirectoryDTO;
import com.tpecx.nasp.application.dto.NaspObjectDTO;
import com.tpecx.nasp.domain.entity.NaspDirectory;
import com.tpecx.nasp.domain.entity.NaspObject;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DataTransferUtil {
    private static Mapper dozerMapper = new DozerBeanMapper();

    public static NaspObjectDTO toObjectDto(NaspObject object) {
        return dozerMapper.map(object, NaspObjectDTO.class);
    }

    public static NaspObject toObject(NaspObjectDTO dto) {
        return dozerMapper.map(dto, NaspObject.class);
    }

    public static NaspDirectoryDTO toDirectoryDto(NaspDirectory directory) {
        return dozerMapper.map(directory, NaspDirectoryDTO.class);
    }

    public static NaspDirectory toDirectory(NaspDirectoryDTO dto) {
        return dozerMapper.map(dto, NaspDirectory.class);
    }
}
