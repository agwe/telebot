package com;

import java.io.IOException;
import com.Models.ResponseGetUpdates;
import com.Models.Update;

public class BotThread implements Runnable {
    TelegramService service;
    String api;
    ResponseGetUpdates responseGetUpdatesCall = null;
    Integer updateId = 0;
    ITeleHandler handler;

    public BotThread(TelegramService service, String api) {
        this.service = service;
        this.api = api;
    }

    /**
     * get updates and start handler to process them
     */
    @Override
    public void run() {
        while (true){
            try {
                responseGetUpdatesCall = service.getUpdatesOffset(api, updateId).execute().body();
                updateId = getLastId();
                if (responseGetUpdatesCall!=null) {
                    handler.onUpdates(responseGetUpdatesCall, api, service);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * get last update id
     * @return last update id
     */
    private Integer getLastId(){
        Integer updateId = 0;
        Integer result;
        for (Update update: responseGetUpdatesCall.getResult()) {
            result = update.getUpdate_id();
            updateId = (updateId < result) ? result : updateId;
        }
        return updateId+1;
    }

    /**
     * set user defined handler for updates
     * @param handler
     */
    public void setHandler(ITeleHandler handler) {
        this.handler = handler;
    }
}
