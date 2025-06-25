package com.irfan.Ecommerce.dto;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreResponse {
    private String status;
    private String message;
    private List<String> categories;


}
