package com.irfan.Ecommerce.gateway.api;

import com.irfan.Ecommerce.dto.FakeStoreResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreResponse> getCategories() throws IOException;
}
