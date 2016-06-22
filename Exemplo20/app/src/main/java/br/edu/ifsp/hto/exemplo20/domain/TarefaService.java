package br.edu.ifsp.hto.exemplo20.domain;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Marcio on 20/06/2016.
 */
public interface TarefaService {

    @GET("tarefa/list")
    Call<List<Tarefa>> listTarefa();

    @POST("tarefa/new")
    Call<Tarefa> newTarefa(@Body Tarefa tarefa);

    /*@FormUrlEncoded
    @POST("tarefa/new")
    Call<Funcionario> criaFuncionario(@Field("nome_emp")String nome_emp, @Field("cargo")String cargo, @Field("chefe")int chefe,
                                      @Field("data_adm")String data_adm, @Field("sal")double sal, @Field("com")double com, @Field("n_dep")int n_dep);
    */
}
