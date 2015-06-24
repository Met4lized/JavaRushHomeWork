package com.javarush.test.level22.lesson09.task02;

import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!params.isEmpty()) {
            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (pair.getKey() != null && pair.getValue() != null) {
                    stringBuilder.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
                }
            }
            stringBuilder.delete(stringBuilder.lastIndexOf(" ") - 5, stringBuilder.lastIndexOf(""));
            stringBuilder.append("'");
        }
        return stringBuilder;
    }
}
