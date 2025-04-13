package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public enum DevilFruitType {
    ZOAN,
    ANCIENT_ZOAN,
    MYTHICAL_ZOAN,
    PARAMECIA,
    LOGIA,
    @JsonEnumDefaultValue
    UNKNOWN
}