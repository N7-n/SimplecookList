package main;

import java.util.ArrayList;
import java.util.List;

public class MessageValidator {
	public static List<String> validate(DTO dto) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(dto.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(dto.getText());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }
        String item_error = validateItem(dto.getItem());
        if(!item_error.equals("")) {
            errors.add(item_error);
        }
        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateContent(String text) {
        if(text == null || text.equals("")) {
            return "作り方を入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateItem(String item) {
        if(item == null || item.equals("")) {
            return "材料を入力してください。";
        }

        return "";
    }
}