package com.irfan.Ecommerce.controller;


import com.irfan.Ecommerce.dto.CategoryDTO;
import com.irfan.Ecommerce.service.FakeStoreCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final FakeStoreCategoryService fakeStoreCategoryService;

    CategoryController(FakeStoreCategoryService fakeStoreCategoryService){
        this.fakeStoreCategoryService=fakeStoreCategoryService;
    }

    @GetMapping
    public List<CategoryDTO> fetchAllCategories() throws IOException {
        return this.fakeStoreCategoryService.fetchCategories();
    }
}
