package com.mapstructdemo.mapstruct;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        // source has field X, target doesn't have X
        unmappedSourcePolicy = ReportingPolicy.IGNORE, // default is IGNORE

        // target has field Y, source doesn't have Y
        unmappedTargetPolicy = ReportingPolicy.ERROR, // default is WARN

        // field Z in target is not of the same type as in source
        typeConversionPolicy = ReportingPolicy.IGNORE, // default is IGNORE

        componentModel = "spring", // default is "default" ¯\_(ツ)_/¯

        uses = CommonMappings.class
)
public class MapStructConfig {
}
