package com.coladela.bookstoremanager.bookstoremanager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotNull
    @Size(max = 200)
    private String name;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotNull
    @Size(max = 100)
    @Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
            message = "ISBN format must be a valid format")
    private String isbn;

    @NotNull
    @Size(max = 200)
    private String publisherName;

    @Valid
    @NotNull
    private AuthorDTO author;
}