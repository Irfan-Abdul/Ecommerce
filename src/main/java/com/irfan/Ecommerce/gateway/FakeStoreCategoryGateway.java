package com.irfan.Ecommerce.gateway;

import com.irfan.Ecommerce.dto.CategoryDTO;
import com.irfan.Ecommerce.dto.FakeStoreResponse;
import com.irfan.Ecommerce.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.List;


@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }


    @Override
    public List<CategoryDTO> fetchAllCategories() throws IOException {
        FakeStoreResponse response = this.fakeStoreCategoryApi.getCategories().execute().body();
        if (response == null) {
            System.out.println("Irfannnnn");
            throw new IOException("Failed to fetch the data"); }
        System.out.println(response.getMessage() + " "+response.getCategories());

        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder().name(category).build())
                .toList();

    }
}