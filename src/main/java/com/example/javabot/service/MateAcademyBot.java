package com.example.javabot.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class MateAcademyBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Tryamkins_bot";
    }

    @Override
    public String getBotToken() {
        return "6284136030:AAG3RzHcKR8ItpssmrovSEufFYW3k73Kmw8";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("Message recivedxxxxxxxxxx");
    }
}
