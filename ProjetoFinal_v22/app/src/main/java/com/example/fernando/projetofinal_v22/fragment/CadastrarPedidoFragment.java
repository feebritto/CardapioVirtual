package com.example.fernando.projetofinal_v22.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.fernando.projetofinal_v22.R;
import com.example.fernando.projetofinal_v22.domain.Pedido;
import com.example.fernando.projetofinal_v22.service.PedidoService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class CadastrarPedidoFragment extends Fragment {
    private Context context;
    private Pedido pedido = new Pedido();

    public CadastrarPedidoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cadastrar_pedido, container, false);
        Button btSalvarPedido = (Button) view.findViewById(R.id.bt_pedir);
        btSalvarPedido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                salvarPedido();
            }
        });

        //L I S T E N E R   M E S A S
        RadioButton radioButtonMesa1 = (RadioButton) view.findViewById(R.id.r1);
        radioButtonMesa1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonMesaClicked(v);
            }
        });

        RadioButton radioButtonMesa2 = (RadioButton) view.findViewById(R.id.r2);
        radioButtonMesa2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonMesaClicked(v);
            }
        });

        RadioButton radioButtonMesa3 = (RadioButton) view.findViewById(R.id.r3);
        radioButtonMesa3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonMesaClicked(v);
            }
        });

        RadioButton radioButtonMesa4 = (RadioButton) view.findViewById(R.id.r4);
        radioButtonMesa4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonMesaClicked(v);
            }
        });

        //L I S T E N E R   T A M A N H O S
        RadioButton radioButtonR200 = (RadioButton) view.findViewById(R.id.r_200);
        radioButtonR200.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonTamanhoClicked(v);
            }
        });

        RadioButton radioButtonR300 = (RadioButton) view.findViewById(R.id.r_300);
        radioButtonR300.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonTamanhoClicked(v);
            }
        });

        RadioButton radioButtonR400 = (RadioButton) view.findViewById(R.id.r_400);
        radioButtonR400.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonTamanhoClicked(v);
            }
        });

        RadioButton radioButtonR500 = (RadioButton) view.findViewById(R.id.r_500);
        radioButtonR500.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonTamanhoClicked(v);
            }
        });

        //L I S T E N E R   F R U T A
        RadioButton radioButtonBanana = (RadioButton) view.findViewById(R.id.r_banana);
        radioButtonBanana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonFrutaClicked(v);
            }
        });

        RadioButton radioButtonMorango = (RadioButton) view.findViewById(R.id.r_morango);
        radioButtonMorango.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonFrutaClicked(v);
            }
        });

        RadioButton radioButtonAbacaxi = (RadioButton) view.findViewById(R.id.r_abacaxi);
        radioButtonAbacaxi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonFrutaClicked(v);
            }
        });

        RadioButton radioButtonKiwi = (RadioButton) view.findViewById(R.id.r_kiwi);
        radioButtonKiwi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonFrutaClicked(v);
            }
        });

        //L I S T E N E R   A C O M P A N H A M E N T O
        RadioButton radioButtonCupuacu = (RadioButton) view.findViewById(R.id.r_cupuacu);
        radioButtonCupuacu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonAcompanhamentoClicked(v);
            }
        });

        RadioButton radioButtonIogurt = (RadioButton) view.findViewById(R.id.r_iogurt);
        radioButtonIogurt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonAcompanhamentoClicked(v);
            }
        });

        RadioButton radioButtonSorvete = (RadioButton) view.findViewById(R.id.r_sorvete);
        radioButtonSorvete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonAcompanhamentoClicked(v);
            }
        });

        //L I S T E N E R   C O B E R T U R A
        RadioButton radioButtonAmendoim = (RadioButton) view.findViewById(R.id.r_amendoim);
        radioButtonCupuacu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonCoberturaClicked(v);
            }
        });

        RadioButton radioButtonLCondensado = (RadioButton) view.findViewById(R.id.r_lCondensado);
        radioButtonLCondensado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonCoberturaClicked(v);
            }
        });

        RadioButton radioButtonLPo = (RadioButton) view.findViewById(R.id.r_lPo);
        radioButtonLPo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onRadioButtonCoberturaClicked(v);
            }
        });
        return view;
    }




    public void onRadioButtonMesaClicked(View v){
        RadioButton rb = (RadioButton) getView().findViewById(v.getId());
        Log.d("Radio", rb.getText().toString());
        pedido.setNumMesa(Integer.parseInt(rb.getText().toString()));
    }
    public void onRadioButtonTamanhoClicked(View v){
        RadioButton rb = (RadioButton) getView().findViewById(v.getId());
        Log.d("Radio", rb.getText().toString());
        pedido.setTamanho(rb.getText().toString());
    }
    public void onRadioButtonFrutaClicked(View v){
        RadioButton rb = (RadioButton) getView().findViewById(v.getId());
        Log.d("Radio", rb.getText().toString());
        pedido.setFruta(rb.getText().toString());
    }
    public void onRadioButtonAcompanhamentoClicked(View v){
        RadioButton rb = (RadioButton) getView().findViewById(v.getId());
        Log.d("Radio", rb.getText().toString());
        pedido.setAcompanhamento(rb.getText().toString());
    }
    public void onRadioButtonCoberturaClicked(View v){
        RadioButton rb = (RadioButton) getView().findViewById(v.getId());
        Log.d("Radio", rb.getText().toString());
        pedido.setCobertura(rb.getText().toString());
    }



    private void salvarPedido(){
        String baseURL = "http://192.168.30.164:9090/";
//Debug
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        PedidoService service = retrofit.create(PedidoService.class);

        Call<Pedido> call = service.novoPedido(pedido);

        call.enqueue(new Callback<Pedido>() {
            @Override
            public void onResponse(Call<Pedido> call, Response<Pedido> response) {
            }

            @Override
            public void onFailure(Call<Pedido> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
