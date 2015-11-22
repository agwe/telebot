package test_run;

import java.io.IOException;
import com.ITeleHandler;
import com.Models.ResponseGetUpdates;
import com.Models.Update;
import com.TelegramService;

public class TeleHandler implements ITeleHandler {

    @Override
    public void onUpdates(ResponseGetUpdates updates, String api, TelegramService service) throws IOException {
        for (Update update: updates.getResult()){
            Integer messageId = update.getMessage().getMessage_id();
            Integer chatId=update.getMessage().getChat().getId();
            service.forwardMessage(api, chatId, chatId, messageId).execute();
        }
    }
}
