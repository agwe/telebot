package test_run;

import com.Telebot;

public class Main {
    public static void main(String args[]){
        TeleHandler teleHandler = new TeleHandler();
        Telebot telebot = new Telebot(args[0].toString(), teleHandler);
        telebot.startBot();
    }
}
