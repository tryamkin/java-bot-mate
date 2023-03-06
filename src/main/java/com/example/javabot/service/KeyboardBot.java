package com.example.javabot.service;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyboardBot {
    public static ReplyKeyboardMarkup keyboardMarkup(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        // list of buttons
        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow keyboardMenuRow = new KeyboardRow();
        keyboardMenuRow.add("Menu");
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add("Breakfast");
        keyboardRow.add("Lunch");
        KeyboardRow keyboardRowSecond = new KeyboardRow();
        keyboardRowSecond.add("Dinner");
        keyboardRowSecond.add("Supper");
        keyboardRows.add(keyboardMenuRow);
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRowSecond);
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;
    }
}
