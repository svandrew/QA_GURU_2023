package data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TelegramJsonToText {
    public static void main(String[] args) throws Exception {
        // Укажи путь к своему JSON-файлу
        String inputPath = "C:/Temrp/esult.json";     // ← ЗАМЕНИ НА СВОЙ ПУТЬ
        String outputPath = "C:/Temp/chat.txt";       // ← ЗАМЕНИ НА СВОЙ ПУТЬ

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File(inputPath));
        JsonNode messages = root.get("messages");

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(outputPath), StandardCharsets.UTF_8)) {

            for (JsonNode msg : messages) {
                String date = msg.has("date") ? msg.get("date").asText() : "";
                String from = msg.has("from") ? msg.get("from").asText() : "Unknown";
                JsonNode textNode = msg.get("text");

                String text = "";
                if (textNode != null) {
                    if (textNode.isTextual()) {
                        text = textNode.asText();
                    } else if (textNode.isArray()) {
                        // Иногда Telegram экспортирует текст как массив (например, с форматированием)
                        StringBuilder sb = new StringBuilder();
                        for (JsonNode part : textNode) {
                            if (part.isTextual()) {
                                sb.append(part.asText());
                            }
                        }
                        text = sb.toString();
                    }
                }

                if (!text.trim().isEmpty()) {
                    writer.write("[" + date + "] " + from + ": " + text + "\n");
                }
            }
        }

        System.out.println("✅ Преобразование завершено. Файл сохранён: " + outputPath);
    }
}