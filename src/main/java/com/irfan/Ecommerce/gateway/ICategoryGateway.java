package com.irfan.Ecommerce.gateway;

import com.irfan.Ecommerce.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {



    List<CategoryDTO> fetchAllCategories() throws IOException;
}
