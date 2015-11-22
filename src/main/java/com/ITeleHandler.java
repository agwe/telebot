package com;

import java.io.IOException;
import com.Models.ResponseGetUpdates;

public interface ITeleHandler {
    public void onUpdates(ResponseGetUpdates updates, String api, TelegramService service) throws IOException;
}
