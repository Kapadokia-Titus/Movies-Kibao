package kapadokia.nyandoro.moviekibao.interfaces;

import kapadokia.nyandoro.moviekibao.model.movie.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
