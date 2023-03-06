package com.example.javabot.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


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
        Message message = update.getMessage(); // рефакторинг
        System.out.println("Message recivedxxxxxxxxxx" + "  " + message.getText());
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Hello user i received your message  -  " + message.getText());
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        MenuMatching(message, sendMessage);
    }


    private void MenuMatching(Message message, SendMessage sendMessage) {
        if (message.getText().equalsIgnoreCase("/start")|| message.getText().equalsIgnoreCase("Menu")){
            // init keyboard
            sendMessage.enableMarkdownV2(true); // try v2
            ReplyKeyboardMarkup replyKeyboardMarkup = KeyboardBot.keyboardMarkup();
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            String text = ("Welcome to my bot, enter your choice: \n"); // начало работы
            text  = text + "Breakfast\n ";
            text  = text + "Dinner\n ";
            text  = text + "Lunch\n ";
            text  = text + "Supper\n ";
            sendMessage.setText(text);
        }
        if (message.getText().equalsIgnoreCase("Lunch")) {
            String menu = "Lunch Menu \n";
            menu = menu + "1. Not ready \n";
            menu = menu + "2. Not ready \n";
            menu = menu + "3. Not ready \n";
            sendMessage.setText(menu);
        }
        if (message.getText().equalsIgnoreCase("Supper")) {
            String menu = "Supper Menu \n";
            menu = menu + "1. Something \n";
            menu = menu + "2. Something \n";
            menu = menu + "3. Something \n";
            sendMessage.setText(menu);
        }
        if (message.getText().equalsIgnoreCase("Breakfast")) {
            String menu = "Breakfast Menu \n";
            menu = menu + "1. BlueBarry \n";
            menu = menu + "2. Banana \n";
            menu = menu + "3. Chocolade \n";
            menu = menu + "4. Milk \n";
            sendMessage.setText(menu);
        }
        if (message.getText().equalsIgnoreCase("Dinner")) {
            String menu = "Dinner Menu \n";
            menu = menu + "1. Potato \n";
            menu = menu + "2. Meat \n";
            menu = menu + "3. Pasta \n";
            menu = menu + "4. Tea \n";
            sendMessage.setText(menu);
        }

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    //Создаем кнопки

}
