package uz.abdurashidov.foodapp.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.abdurashidov.foodapp.data.remote.models.GetMealsByCategoryResponse

interface FoodService {

    @GET("filter.php")
    fun getMealsByCategory(@Query("c") category: String): Response<GetMealsByCategoryResponse>
}