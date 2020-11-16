package com.example.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;


public class BichosFragment extends Fragment implements View.OnClickListener {

    /*Variáveis ImagemButton**/
    /**
     * MediaPlayer Variable
     **/
    ImageButton buttonCao, buttonLeao, buttonVaca, buttonMacaco, buttonOvelha, buttonGato;

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
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);
        ligacoes(view);

        /*
         * Método dos Botões - Conecatando ao Evento de Clique
         **/
        //Method of Buttons - Connecting to Click Listeners
        buttonCao.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        /*Fim**/
        //End

        //Retornando a View
        //Returning the View
        return view;
    }

    public void ligacoes(View view) {
        /*Criando Ligações**/
        //Creating Hooks
        buttonCao = view.findViewById(R.id.buttonCao);
        buttonLeao = view.findViewById(R.id.buttonLeao);
        buttonVaca = view.findViewById(R.id.buttonVaca);
        buttonMacaco = view.findViewById(R.id.buttonMacaco);
        buttonOvelha = view.findViewById(R.id.buttonOvelha);
        buttonGato = view.findViewById(R.id.buttonGato);
        /*Fim**/
        //End
    }

    /**
     * Método OnClick - Eventos de Cliques Individuais
     **/
    //OnClick Method - Individuals Click Listeners
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.buttonCao) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
            tocarSom();
        }
        if (view.getId() == R.id.buttonLeao) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
            tocarSom();
        }
        if (view.getId() == R.id.buttonVaca) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
            tocarSom();
        }
        if (view.getId() == R.id.buttonMacaco) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
            tocarSom();
        }
        if (view.getId() == R.id.buttonOvelha) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
            tocarSom();
        }
        if (view.getId() == R.id.buttonGato) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
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