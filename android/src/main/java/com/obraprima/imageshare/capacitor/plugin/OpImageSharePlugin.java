package com.obraprima.imageshare.capacitor.plugin;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.ArrayList;
import org.json.JSONArray;

@CapacitorPlugin(name = "OpImageShare")
public class OpImageSharePlugin extends Plugin {

    private static final String TAG = "OpImageSharePlugin";
    private static final String PREFIXO_TIPO_IMAGEM = "image/";
    private static final String ACAO_ENVIAR_UNITARIO = Intent.ACTION_SEND;
    private static final String ACAO_ENVIAR_MULTIPLO = Intent.ACTION_SEND_MULTIPLE;

    @Override
    public void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        Log.d(TAG, "Nova intent recebida: " + intent.getAction());

        if (intent.getAction() == null || intent.getType() == null) {
            Log.w(TAG, "Ação ou tipo da intent está nulo. Ignorando...");
            return;
        }

        String acao = intent.getAction();
        String tipo = intent.getType();

        if (!tipo.startsWith(PREFIXO_TIPO_IMAGEM)) {
            Log.w(TAG, "Tipo de conteúdo não é uma imagem. Ignorando...");
            return;
        }

        JSObject retorno = new JSObject();

        if (ACAO_ENVIAR_UNITARIO.equals(acao)) {
            Uri uriImagem = intent.getParcelableExtra(Intent.EXTRA_STREAM);

            if (uriImagem == null) {
                Log.w(TAG, "Nenhuma imagem recebida. Ignorando...");
                return;
            }

            retorno.put("uriImagem", uriImagem.toString());
            notifyListeners("imageReceived", retorno);
            Log.d(TAG, "Imagem única recebida: " + uriImagem.toString());
            return;
        }

        if (ACAO_ENVIAR_MULTIPLO.equals(acao)) {
            ArrayList<Uri> urisImagens = intent.getParcelableArrayListExtra(Intent.EXTRA_STREAM);

            if (urisImagens == null || urisImagens.isEmpty()) {
                Log.w(TAG, "Nenhuma imagem múltipla recebida. Ignorando...");
                return;
            }

            JSONArray arrayImagens = new JSONArray();
            for (Uri uri : urisImagens) {
                arrayImagens.put(uri.toString());
            }

            retorno.put("urisImagens", arrayImagens);
            notifyListeners("imageReceived", retorno);
            Log.d(TAG, "Imagens múltiplas recebidas: " + arrayImagens.length() + " imagens");
        }
    }
}
