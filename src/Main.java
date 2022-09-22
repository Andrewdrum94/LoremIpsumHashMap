import java.util.*;

public class Main {

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static Map<Character, Integer> symbol = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < text.length(); i++) {
            char key = text.toLowerCase().charAt(i);
            if (Character.isLetter(key)) {//проверяем, является ли символ буквой
                if (symbol.containsKey(key)) { //если мапа содержит уже такой ключ
                    symbol.put(key, symbol.get(key) + 1);
                } else {
                    symbol.put(key, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> kv : symbol.entrySet()) {
            if (Objects.equals(kv.getValue(), Collections.max(symbol.values()))) {
                System.out.println(kv.getKey() + " - " + kv.getValue());
            }
        }

        for (Map.Entry<Character, Integer> kv : symbol.entrySet()) {
            if (Objects.equals(kv.getValue(), Collections.min(symbol.values()))) {
                System.out.println(kv.getKey() + " - " + kv.getValue());
            }
        }
    }
}
