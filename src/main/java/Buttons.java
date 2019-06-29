
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;


public class Buttons {


    public synchronized InlineKeyboardMarkup  setButtons() {
        // Создаем клавиуатуру
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//        sendMessage.setReplyMarkup(replyKeyboardMarkup);
//        replyKeyboardMarkup.setSelective(true);
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        replyKeyboardMarkup.setOneTimeKeyboard(false);
//        // Создаем список строк клавиатуры
//        List<KeyboardRow> keyboard = new ArrayList<>();
//
//        // Первая строчка клавиатуры
//        KeyboardRow keyboardFirstRow = new KeyboardRow();
//        // Добавляем кнопки в первую строчку клавиатуры
//        keyboardFirstRow.add(new KeyboardButton("Производство"));
//
//        // Вторая строчка клавиатуры
//        KeyboardRow keyboardSecondRow = new KeyboardRow();
//        // Добавляем кнопки во вторую строчку клавиатуры
//        keyboardSecondRow.add(new KeyboardButton("Торговля"));
//
//
//        KeyboardRow keyboardThirdRow = new KeyboardRow();
//        keyboardThirdRow.add(new KeyboardButton("Сфера услуг"));
//
//        KeyboardRow keyboardАForthRow = new KeyboardRow();
//        keyboardАForthRow.add(new KeyboardButton("Иное"));

        // Добавляем все строчки клавиатуры в список
//        keyboard.add(keyboardFirstRow);
//        keyboard.add(keyboardSecondRow);
//        keyboard.add(keyboardThirdRow);
//        keyboard.add(keyboardАForthRow);
//
//        // и устанваливаем этот список нашей клавиатуре
//        replyKeyboardMarkup.setKeyboard(keyboard);


        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton=new InlineKeyboardButton();
        inlineKeyboardButton.setText("Торговля");
        inlineKeyboardButton.setCallbackData("trade");

        InlineKeyboardButton inlineKeyboardButton2 =new InlineKeyboardButton();
        inlineKeyboardButton.setText("Иное");
        inlineKeyboardButton.setCallbackData("other");

        List<InlineKeyboardButton> keyboardButtonsRow1= new ArrayList<>();
        keyboardButtonsRow1.add(inlineKeyboardButton);
        List<InlineKeyboardButton> keyboardButtonsRow2= new ArrayList<>();
        keyboardButtonsRow2.add(inlineKeyboardButton2);

        List<List<InlineKeyboardButton>> rowList =new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
         inlineKeyboardMarkup.setKeyboard(rowList);
         return inlineKeyboardMarkup;



    }
}
