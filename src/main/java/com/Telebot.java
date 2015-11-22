package com;

import com.squareup.okhttp.OkHttpClient;
import test_run.TeleHandler;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class Telebot {
    private OkHttpClient client;
    private Retrofit retrofit;
    private TelegramService service;
    private String token;
    private TeleHandler handler;

    /**
     * API service constructor
     * @param token bot token
     * @param handler for processing updates (should implement ITeleHandler)
     */
    public Telebot(String token,TeleHandler handler){
        this.token = token;
        this.handler = handler;

        client = new OkHttpClient();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.telegram.org")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .validateEagerly()
                .build();

        service = retrofit.create(TelegramService.class);
    }

    /**
     * Thread for getting updates constantly
     */
    public void startBot(){
        BotThread thread = new BotThread(service, token);
        thread.setHandler(handler);
        thread.run();
    }
}