package com.irfan.Ecommerce.service;

import com.irfan.Ecommerce.dto.CategoryDTO;
import com.irfan.Ecommerce.gateway.FakeStoreCategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final FakeStoreCategoryGateway fakeStoreCategoryGateway;

    FakeStoreCategoryService(FakeStoreCategoryGateway fakeStoreCategoryGateway){
        this.fakeStoreCategoryGateway=fakeStoreCategoryGateway;
    }
    @Override
    public List<CategoryDTO> fetchCategories() throws IOException {
        return this.fakeStoreCategoryGateway.fetchAllCategories();

    }
}
