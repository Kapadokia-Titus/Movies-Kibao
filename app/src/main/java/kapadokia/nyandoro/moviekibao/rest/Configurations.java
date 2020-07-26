package kapadokia.nyandoro.moviekibao.rest;
import kapadokia.nyandoro.moviekibao.model.configuration.ConfigurationResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Configurations {
    //CONFIGURATIONS
    @GET("/configuration")
    Call<ConfigurationResponse> configurations(@Query("api_key") String apiKey);
}
