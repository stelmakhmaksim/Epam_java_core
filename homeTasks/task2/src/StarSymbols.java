import java.util.HashMap;
import java.util.Map;

public class StarSymbols {
    private Map<Character, char[][]> charMap;
    private Map<String, char[][]> stringMap;

    public StarSymbols() {
        char[][] zero = {
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' '}
        };

        char[][] one = {
                {' ', ' ', '*', ' ', ' '},
                {' ', '*', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' '}
        };

        char[][] two = {
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] three = {
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] four = {
                {' ', '*', ' ', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', ' ', '*', ' '}
        };

        char[][] five = {
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] six = {
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] seven = {
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', ' ', ' ', '*', ' '}
        };

        char[][] eight = {
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] nine = {
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', '*', ' '},
                {' ', '*', '*', '*', ' '}
        };

        char[][] minus = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}

        };

        char[][] dot = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', ' '}
        };

        char[][] e = {
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', '*', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '}

        };


        char[][] infinity = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
                {' ', '*', ' ', '*', ' ', '*', ' ', '*', ' '},
                {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
                {' ', '*', ' ', '*', ' ', '*', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        char[][] minusInfinity = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', ' ', '*', ' ', '*', ' ', '*', ' ', '*', ' '},
                {'*', '*', ' ', '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', '*', ' ', '*', ' ', '*', ' ', '*', ' '},
                {' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        char[][] nan = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'*', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', '*'},
                {'*', '*', ' ', '*', ' ', '*', ' ', '*', ' ', '*', '*', ' ', '*'},
                {'*', '*', '*', '*', ' ', '*', '*', '*', ' ', '*', '*', '*', '*'},
                {'*', ' ', '*', '*', ' ', '*', ' ', '*', ' ', '*', ' ', '*', '*'},
                {'*', ' ', ' ', '*', ' ', '*', ' ', '*', ' ', '*', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        charMap = new HashMap<>();
        stringMap = new HashMap<>();
        charMap.put('0', zero);
        charMap.put('1', one);
        charMap.put('2', two);
        charMap.put('3', three);
        charMap.put('4', four);
        charMap.put('5', five);
        charMap.put('6', six);
        charMap.put('7', seven);
        charMap.put('8', eight);
        charMap.put('9', nine);
        charMap.put('-', minus);
        charMap.put('.', dot);
        charMap.put('E', e);
        stringMap.put("Infinity", infinity);
        stringMap.put("-Infinity", minusInfinity);
        stringMap.put("NaN", nan);
    }

    public void printText(String text) {
        if (text.equals("Infinity") || text.equals("NaN") || text.equals("-Infinity")) {
            char[][] ch = stringMap.get(text);
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < ch[i].length; j++) {
                    System.out.print(ch[i][j]);
                }
                System.out.println();
            }
        } else {
            char[] chars = text.toCharArray();
            for (int i = 0; i < 5; i++) {
                for (char c : chars) {
                    char[][] ch = charMap.get(c);
                    for (int j = 0; j < ch[i].length; j++) {
                        System.out.print(ch[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}