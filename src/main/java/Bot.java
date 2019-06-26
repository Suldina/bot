import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


import java.util.Properties;
import java.util.logging.Level;

import static org.telegram.telegrambots.meta.logging.BotLogger.log;


public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для приема сообщений.
     * @param update Содержит сообщение от пользователя.
     */


    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
//        String message = update.getMessage().toString();
            if    (message !=null && message.hasText()) {

                if (message.getText().equals("/start")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Выберите основную сферу деятельности:");

                }
            }

    }
    /**
     * Метод для настройки сообщения и его отправки.
     * @param chatId id чата
     * @param s Строка, которую необходимот отправить в качестве сообщения.
     */
    public void sendMsg(String chatId, String s) {
        int questionnumber;
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
//        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setChatId(chatId);
//        sendMessage.setReplyToMessageId();
        sendMessage.setText(s);
        Buttons buttons =new Buttons();
        buttons.setButtons(sendMessage);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log(Level.SEVERE, "Exception: ", e.toString());
        }
    }

    /**
     * Метод возвращает имя бота, указанное при регистрации.
     * @return имя бота
     */
    @Override
    public String getBotUsername() {
        return "SuldinaAlfa_bot";
    }

    /**
     * Метод возвращает token бота для связи с сервером Telegram
     * @return token для бота
     */
    @Override
    public String getBotToken() {
        return System.getenv ("token")
        ;

    }
}