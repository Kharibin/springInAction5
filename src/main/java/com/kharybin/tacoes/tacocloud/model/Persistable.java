package com.kharybin.tacoes.tacocloud.model;

import lombok.Data;

import java.util.Date;

@Data
public abstract class Persistable {
    private Long id;
    private Date placedAt;
}
