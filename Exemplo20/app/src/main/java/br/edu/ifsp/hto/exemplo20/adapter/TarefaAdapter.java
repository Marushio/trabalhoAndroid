package br.edu.ifsp.hto.exemplo20.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.edu.ifsp.hto.exemplo20.R;
import br.edu.ifsp.hto.exemplo20.domain.Tarefa;

/**
 * Created by Marcio on 21/06/2016.
 */
public class TarefaAdapter extends BaseAdapter {
    private final Context context;
    private final List<Tarefa> tarefas;

    public TarefaAdapter(Context context, List<Tarefa> tarefas) {
        this.context = context;
        this.tarefas = tarefas;
    }

    @Override
    public int getCount() {
        return tarefas != null? tarefas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return tarefas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return tarefas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_tarefa, parent, false);
        TextView tvTitulo = (TextView) view.findViewById(R.id.tvTituloTarefa);
        TextView tvTexto = (TextView) view.findViewById(R.id.tvTextotarefa);
        TextView tvCriador = (TextView) view.findViewById(R.id.tvCriadorTarefa);

        Tarefa tarefa = tarefas.get(position);
        tvTitulo.setText(tarefa.getTitulo());
        tvTexto.setText(tarefa.getTexto());
        tvCriador.setText(tarefa.getCriador());
        return view;
    }
}
