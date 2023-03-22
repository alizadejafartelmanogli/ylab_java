package homework03.Transliterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TransliteratorImpl implements Transliterator {
    private Map<String, String> transliteratorMap;

    public TransliteratorImpl() {
        this.transliteratorMap = new HashMap<>() {{
            put("А", "A");
            put("Б", "B");
            put("В", "V");
            put("Г", "G");
            put("Д", "D");
            put("Е", "E");
            put("Ё", "E");
            put("Ж", "ZH");
            put("З", "Z");
            put("И", "I");
            put("Й", "I");
            put("К", "K");
            put("Л", "L");
            put("М", "M");
            put("Н", "N");
            put("О", "O");
            put("П", "P");
            put("Р", "R");
            put("С", "S");
            put("Т", "T");
            put("У", "U");
            put("Ф", "F");
            put("Х", "KH");
            put("Ц", "TS");
            put("Ч", "CH");
            put("Ш", "SH");
            put("Щ", "SHCH");
            put("Ы", "Y");
            put("Ь", "");
            put("Ъ", "IE");
            put("Э", "E");
            put("Ю", "IU");
            put("Я", "IA");
        }};
    }

    @Override
    public String transliterate(String source) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char symbol = source.charAt(i);
            Iterator<Map.Entry<String, String>> entries = this.transliteratorMap.entrySet().iterator();
            Map.Entry<String, String> entry = entries.next();
            while (true) {
                if (entry.getKey().charAt(0) == symbol) {
                    stringBuilder.append(entry.getValue());
                    break;
                } else if (entries.hasNext()) {
                    entry = entries.next();
                } else {
                    stringBuilder.append(symbol);
                    break;
                }
            }
        }
        return String.valueOf(stringBuilder);
    }
}
