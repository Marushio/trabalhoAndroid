package br.edu.ifsp.hto.exemplo20.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Marcio on 20/06/2016.
 */
public class Tarefa {
    @SerializedName("id")
    private long id;
    @SerializedName("titulo")
    private String titulo;
    @SerializedName("texto")
    private String texto;
    @SerializedName("criador")
    private String criador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }
}
