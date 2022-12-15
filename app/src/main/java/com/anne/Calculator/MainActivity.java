package com.anne.Calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/*AL*/
public class MainActivity extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
    private Button btPlus, btDiv, btMult, btMinus, btPlusMinus, btFat, btSqrt, btPow2, btDot;
    private Button btClear, btCe, btErase, btResult;
    private EditText screen;
    private  boolean operator, hasdot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Назначение переменных представлениям
        // числа
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);

        // Математические операции
        btPlus = findViewById(R.id.btplus);
        btMinus = findViewById(R.id.btminus);
        btDiv = findViewById(R.id.btdiv);
        btMult = findViewById(R.id.btmult);
        btPow2 = findViewById(R.id.btpow2);

        // Другие операции
        btResult = findViewById(R.id.btresult);
        btDot = findViewById(R.id.btdot);
        btClear = findViewById(R.id.btclear);
        btCe = findViewById(R.id.btCE);
        btErase = findViewById(R.id.btErase);

        // Вывод
        screen = findViewById(R.id.screen);
        screen.setFocusable(false);
    }

    // Методы для каждого из чисел
    public void add0(View v) {
        // Требуется оператором значение false каждый раз, когда пользователь
        // может ввести оператор, так как он вводит число
        operator = false;
        // Если на экране бесконечность и пользователь набирает 0, убираем все и ставим 0
        // запретить пользователю также набирать 000000000000000
        if(screen.getText().toString().compareToIgnoreCase("Infinity") == 0 ||
                (screen.getText().length() == 1 && screen.getText().charAt(0) == '0'))
            screen.setText("");
        screen.setText(screen.getText() + "0");
        movecarot();
    }

    public void add1(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0') ||
                screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "1");
        movecarot();
    }

    public void add2(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "2");
        movecarot();
    }

    public void add3(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "3");
        movecarot();
    }

    public void add4(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "4");
        movecarot();
    }

    public void add5(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "5");
        movecarot();
    }

    public void add6(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "6");
        movecarot();
    }

    public void add7(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "7");
        movecarot();
    }

    public void add8(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "8");
        movecarot();
    }

    public void add9(View v) {
        operator = false;
        // если есть только 0 и набрано другое число, убираем 0, так как оставлять его там бесполезно
        // кроме того, если есть бесконечность, то также удалить все
        if((screen.getText().length() == 1 && screen.getText().charAt(0) == '0')
                || screen.getText().toString().compareToIgnoreCase("Infinity") == 0)
            screen.setText("");
        screen.setText(screen.getText() + "9");
        movecarot();
    }

    // Operations
    public void sum(View v) {
        // если выражения нет, то компьютер не сможет включить оператор суммы
        // Кроме того, если есть что-то, но это что-то Бесконечность, то оператор тоже нельзя вставить
        if(!TextUtils.isEmpty(screen.getText().toString()) && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            // Если оператор истинен, это потому, что пользователь уже ввел оператор, и невозможно иметь один за другим
            // По этой причине в соответствии с обычными калькуляторами будет разрешен последний вставленный оператор
            if(operator) {
                // необходимо убрать три последних символа, так как формат выражения стал "пробел оператор пробел"
                // то нам нужно удалить эти три символа
                screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
            }

            // после удаления вставляем пробел + пробел...
            screen.setText(screen.getText().toString() + " + ");
            operator = true; // указываем, что был вставлен оператор
            // был добавлен оператор, поэтому следующее значение гарантированно будет числом,
            // независимо от того, вводит ли пользователь другой оператор или нет. Поэтому необходимо установить для hasdot значение false
            hasdot = false;
            movecarot();
        }
    }

    public void sub(View v) {
        // чтобы вставить -, те же операции, что и для вставки +
        if(!TextUtils.isEmpty(screen.getText().toString()) && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            if(operator) {
                screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
            }

            screen.setText(screen.getText() + " - ");
            operator = true;
            hasdot = false;
            movecarot();
        }
    }

    public void div(View v) {
        // чтобы вставить -, те же операции, что и для вставки +
        if(!TextUtils.isEmpty(screen.getText().toString()) && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            if(operator) {
                screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
            }

            screen.setText(screen.getText() + " / ");
            operator = true;
            hasdot = false;
            movecarot();
        }
    }

    public void mult(View v) {
        // чтобы вставить -, те же операции, что и для вставки +
        if(!TextUtils.isEmpty(screen.getText().toString()) && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            if(operator) {
                screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
            }

            screen.setText(screen.getText().toString() + " * ");
            operator = true;
            hasdot = false;
            movecarot();
        }
    }



    public void powto2(View v) {
        // чтобы вставить -, те же операции, что и для вставки +
        if(!TextUtils.isEmpty(screen.getText().toString()) && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            if(operator) {
                screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
            }

            screen.setText(screen.getText().toString() + " ^ ");
            operator = true;
            hasdot = false;
            movecarot();
        }
    }


    public void dot(View v) {
        if(!hasdot && !operator
                && !TextUtils.isEmpty(screen.getText().toString())
                && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            screen.setText(screen.getText()+".");
            // hasdot true, чтобы не допустить вставки другого
            hasdot = true;
            movecarot();
        }
    }

    public void clear(View v) {
        // удалить все выражения с экрана
        screen.setText("");
        // устанавливаем hasdot и оператор в false
        hasdot = operator = false;
        movecarot();
    }

    // четкая запись стирает последнее введенное или полученное значение
    public void ce(View v) {
        if(!TextUtils.isEmpty(screen.getText().toString()) && !operator) {
            // удалить последнее значение с помощью функции ниже
            getLastDigitedNumber();
            // можно вставить точку, последнее значение удалено
            hasdot = false;
            // нельзя вставить операнд ( или он сейчас есть, или ли ничего нет, или потому что выражение пустое)
            operator = true;
            movecarot();
        }
    }

    public void erase(View v) {
        char lastChar = ' ';
        // можно удалить, только если выражение не пустое
        if(!TextUtils.isEmpty(screen.getText().toString())) {
            // сначала проверяем, не бесконечность ли это
            if(screen.getText().toString().compareToIgnoreCase("Infinity") == 0) {
                // удалить все, если есть
               screen.setText("");
            } else {
                // проверяем, не является ли последнее значение оператором, при удалении пробела оператор пробел
                if (operator) {
                    screen.setText(screen.getText().subSequence(0, screen.getText().length() - 3));
                    operator = false; // разрешить пользователю снова вставить другой оператор, так как последний был удален
                } else {
                    // получение последнего символа, чтобы получить позже, если удаленный символ не является точкой
                    lastChar = screen.getText().charAt(screen.getText().length() - 1);
                    // удалить последний символ
                    screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                }
                //нужно проверить последнее текущее значение
                // если выражение больше 0, то данные еще есть (избегайте исключения IndexOutOfBoundsException)
                if (screen.getText().length() > 0) {
                    char currentLastOne = screen.getText().charAt(screen.getText().length() - 1);
                    // если осталась точка, удаляем ее вместе с номером, который был взят
                    if (currentLastOne == '.') {
                        screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                        // точка для false, чтобы пользователь мог использовать снова
                        hasdot = false;
                    } else if (currentLastOne == ' ') {
                        // если это пробел, значит, то, что было удалено, было числом, а перед этим числом был оператор
                        // следовательно, оператор = true, чтобы указать, что оператор уже существует (раньше он был ложным, так как было число)
                        operator = true;
                    } else if (currentLastOne == '-') {
                        // Если это -, это потому, что удаленное число было отрицательным, удалите и его
                        screen.setText(screen.getText().subSequence(0, screen.getText().length() - 1));
                    }
                }
            }

            // если удаленный символ не был ни оператором, ни числом, то это был ., поэтому необходимо установить для hasdot значение false
            // разрешить пользователю снова ввести точку, так как та, что была у него, была удалена
            if(lastChar == '.')
                hasdot = false;
            movecarot();
        }
    }


    public void result(View v) {
        if(!TextUtils.isEmpty(screen.getText().toString())
                && !operator && screen.getText().toString().compareToIgnoreCase("Infinity") != 0) {
            List<Double> number = new ArrayList<Double>();
            List<Character> operators = new ArrayList<Character>();

            String expression = screen.getText().toString();
            String value = ""; // будем хранить номер за номером
            expression+=" "; // для оценки последнего значения
            for(int i = 0; i < expression.length(); i++) {
                // Необходимо проверить, нет ли пробела и символ в i не является оператором или
                // это оператор (- отрицательный), но после этого оператора нет пробела (есть число)
                if((expression.charAt(i) != ' ' && !isAnOperatorSign(expression.charAt(i))) ||
                        (isAnOperatorSign(expression.charAt(i)) && expression.charAt(i + 1) != ' ')) {
                    value += expression.charAt(i);
                } else {
                    // если вы попали сюда, то получили номер или оператор
                    if(value != "") {
                        // если отличается от пустого, просто вставляем его в список номеров
                        number.add(Double.parseDouble(value));
                        value = ""; // снова пусто, чтобы получить новые числа
                    } else {
                        // если он попал сюда, это может быть оператор (проверьте это, так как это также может быть пробел)
                        if(isAnOperatorSign(expression.charAt(i))) {
                            // добавляем в список операторов
                            operators.add((expression.charAt(i)));
                        }
                    }
                }
            }
            // Проверяем, есть ли хотя бы один оператор, иначе нет операции для выполнения (поэтому оставьте номер)
            if(operators.size() > 0) {
                // получаем ответ как double и конвертируем в строку
                String resp = calculation(number, operators).toString();
                // если в результате есть точка, обновить его
                hasdot = doesItHasADot(resp);
                // проверяем, не являются ли оставшиеся данные равными .0
                if(resp.charAt(resp.length() - 1) == '0' && resp.charAt(resp.length() - 2) == '.') {
                    // если введено здесь, удалите этот 0 и этот .
                    resp = resp.substring(0, resp.length() - 2);
                    // устанавливаем для hasdot значение false, так как оно было удалено
                    hasdot = false;
                }
                // обновляем экран
                screen.setText(resp);
                // снова устанавливаем оператору значение false
                operator = false;
                movecarot();
            }
        }

    }

    // дробные
    public Double calculation(List<Double>number, List<Character>op) {
        Double resp = 0.0;
        // Пока размер массива больше единицы, это потому, что есть еще число для вычисления, и в позиции 0 массива
        // число, результат выражения будет сохранен
        while(number.size() > 1) {
            // сначала проверяем, есть ли операторы с приоритетом и их позиции
            int i;
            boolean found = false;
            for (i = 0; i < op.size(); i++) {
                if(op.get(i) == '/' || op.get(i) == '*') {
                    // найден оператор с более высоким приоритетом (слева направо)
                    found = true;
                    break;
                }
            }
            // если вы его не нашли, это потому, что больше нет операторов с более высоким приоритетом, поэтому начните с 0 и далее (только + и -)
            if(!found) {
                i = 0;
            }
            // операция выполняется между числом i и i + 1 и сохраняется в i + 1, когда были взяты значения, она была выполнена
            // число, оператор, число, поэтому i = операция с первым числом, гарантировано
            // i также относится к оператору, а i + 1 относится = к следующему числу, а также, если вы дошли до этого места, это гарантировано
            // что есть как минимум два числа и математический оператор
            resp = doMath(number.get(i), number.get(i + 1), op.get(i));
            // теперь сохраняет результат в i + 1 и удаляет i
            number.set(i + 1, resp);
            number.remove(i);
            // также удаляем используемый оператор
            op.remove(i);
        }

        return resp;
    }

    public String getLastDigitedNumber() {
        String expression = "";
        int i = 0;
        for(i = screen.getText().length() - 1; i >= 0; i--) {
            if(screen.getText().charAt(i) != ' ') {
                expression+=screen.getText().charAt(i);
            } else {
                break; // место найдено, последнее число заполнено
            }
        }
        // Строка ниже удаляет последнее значение
        // [Начало, конец) -> если i + 1 == 0, так как i равно -1 (просмотрел все выражение), ничего не получает (убирает все выражение с экрана),
        // скорее всего был только 1 номер и его удалили
        // если i не -1, был оператор (найден пробел), нужно сохранить его, чтобы гарантировать формат (пробел оператора пробела), i + 1 позволяет
        screen.setText(screen.getText().subSequence(0, i + 1));
        // необходимо вернуть его, если есть (число было взято инвертированным)
        String finalres = "";
        for(i = expression.length() - 1; i >= 0; i--)
            finalres+=expression.charAt(i);

        return finalres;
    }

    // проверяем есть ли точка в числе или нет
    public boolean doesItHasADot(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    // выполняем математику
    public double doMath(Double n1, double n2, char op) {
        double r = 0;
        switch(op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '/':
                r = n1 / n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '^':
                r = Math.pow(n1, n2);
                break;
        }
        return r;
    }

    // Проверяем, является ли char математическим оператором
    public boolean isAnOperatorSign(char c) {
        return (c == '+' || c == '-' || c == '/' || c == '*' || c == '^');
    }

    // перемещаем курсор по тексту
    public void movecarot() {
        screen.setSelection(screen.getText().length());
    }
}
