package br.edu.ifsp.hto.exemplo20.task;

import android.content.Context;
import android.widget.ListView;

import java.util.List;

import br.edu.ifsp.hto.exemplo20.adapter.TarefaAdapter;
import br.edu.ifsp.hto.exemplo20.domain.Tarefa;
import br.edu.ifsp.hto.exemplo20.domain.TarefaService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Marcio on 21/06/2016.
 */
public class TarefaTask {
    List<Tarefa> tarefas;

    public void TarefaTask(final Context context, final ListView listView){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.69.103:8090/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TarefaService tarefaService = retrofit.create(TarefaService.class);
        Call<List<Tarefa>> listCall = tarefaService.listTarefa();
        listCall.enqueue(new Callback<List<Tarefa>>() {
            @Override
            public void onResponse(Call<List<Tarefa>> call, Response<List<Tarefa>> response) {
                tarefas = response.body();
                listView.setAdapter(new TarefaAdapter(context, tarefas));
            }

            @Override
            public void onFailure(Call<List<Tarefa>> call, Throwable t) {

            }
        });
    }
}
