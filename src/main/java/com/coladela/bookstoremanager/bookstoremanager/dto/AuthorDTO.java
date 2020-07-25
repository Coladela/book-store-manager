package com.coladela.bookstoremanager.bookstoremanager.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    private Long id;

    @NotNull
    @Size(max = 200)
    private String name;

    @NotNull
    private Integer age;
}