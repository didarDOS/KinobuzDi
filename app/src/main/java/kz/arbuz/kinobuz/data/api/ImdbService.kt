package kz.arbuz.kinobuz.data.api

import kz.arbuz.kinobuz.data.entity.ApiMovie
import kz.arbuz.kinobuz.domain.entity.MovieListResponse
import retrofit2.http.GET

/**
 * --> API URL <--
 * https://imdb-api.com/api
 *
 * API KEY IN BUILD CONFIG
 */
interface ImdbService {

    @GET("ru/API/Top250Movies/k_q9j211h2/")
    suspend fun getMovies(): MovieListResponse
}