package com.irfan.Ecommerce.service;

import com.irfan.Ecommerce.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> fetchCategories() throws IOException;
}
