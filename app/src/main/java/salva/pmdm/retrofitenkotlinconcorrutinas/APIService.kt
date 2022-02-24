package salva.pmdm.retrofitenkotlinconcorrutinas

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

// Suspend será necesaria para trabajar con corrutinas, es decir, siempre que queramos hacer
// llamadas en segundo plano usando corrutinas tendremos que añadirla al código.
interface APIService {
    @GET
    fun getDogsByBreeds(@Url url:String): Call<DogsResponse>
}