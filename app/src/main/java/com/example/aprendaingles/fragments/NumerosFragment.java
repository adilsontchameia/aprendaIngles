package com.example.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;

public class NumerosFragment extends Fragment implements View.OnClickListener {

    /*Variáveis ImagemButton**/
    /**
     * MediaPlayer Variable
     **/
    ImageButton buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis;

    /*Variável MediaPlayer**/
    /**
     * MediaPlayer Variable
     **/
    MediaPlayer mediaPlayer;
    //Fim
    //End

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Carregando Layout
        //Loading the Layout
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        /*Criando Ligações**/
        //Creating Hooks
        buttonUm = view.findViewById(R.id.buttonUm);
        buttonDois = view.findViewById(R.id.buttonDois);
        buttonTres = view.findViewById(R.id.buttonTres);
        buttonQuatro = view.findViewById(R.id.buttonQuatro);
        buttonCinco = view.findViewById(R.id.buttonCinco);
        buttonSeis = view.findViewById(R.id.buttonSeis);
        /*Fim**/
        //End

        /*Método dos Botões - Conecatando ao Evento de Clique**/
        //Method of Buttons - Connecting to Click Listeners
        buttonUm.setOnClickListener(this);
        buttonDois.setOnClickListener(this);
        buttonTres.setOnClickListener(this);
        buttonQuatro.setOnClickListener(this);
        buttonCinco.setOnClickListener(this);
        buttonSeis.setOnClickListener(this);
        /*Fim**/
        //End

        //Retornando a View
        //Returning the View
        return view;

    }

    /**
     * Método OnClick - Eventos de Cliques Individuais
     **/
    //OnClick Method - Individuals Click Listeners
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.buttonUm) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
            tocarSom();
        }
        if (view.getId() == R.id.buttonDois) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
            tocarSom();
        }
        if (view.getId() == R.id.buttonTres) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
            tocarSom();
        }
        if (view.getId() == R.id.buttonQuatro) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
            tocarSom();
        }
        if (view.getId() == R.id.buttonCinco) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
            tocarSom();
        }
        if (view.getId() == R.id.buttonSeis) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
            tocarSom();
        }
    }
    //Fim
    //End

    /**
     * Validação do MediaPlayer
     **/
    //MediaPlayer Validation
    public void tocarSom() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }
    }
    //Fim
    //End
}