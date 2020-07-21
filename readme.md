### Задача - реализация простых сервисов


 Реализовать простые REST сервисы на базе Spring Boot. В рамках которых решаются следующие задачи.

В качестве решения предоставить ссылку на git репозиторий с кодом реализации задач.
 
1) POST сервис.

Описание: Ввести N строк. Упорядочить и вывести строки в порядке возрастания значений их длины. В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
 
Формат входных данных: массив (коллекция) строк
 
Формат выходных данных: В результате выполнения сервиса должен быть возвращен json со списком следующего вида:
 
(длина строки): строка наименьшей длины
(длина строки): строка большей длины
(длина строки): строка большей длины

...
 
Пример выполнения задания:

Входные данные (json):

[

            "Тихо струится река серебристая",

            "В царстве вечернем зеленой весны.",

            "Солнце садится за горы лесистые.",

            "Рог золотой выплывает луны."

]
 
Выходные данные:
 
[

            "(27): Рог золотой выплывает луны.",

            "(30): Тихо струится река серебристая",

            "(32): Солнце садится за горы лесистые.",

            "(33): В царстве вечернем зеленой весны."

]

 

===================================================

 
2) GET сервис:

Описание: Ввести число от 1 до 12. Вернуть строку с названием месяца.

Осуществить проверку корректности ввода числа.
 
Формат входных данных: GET параметр - целое число 1-12.

 
Формат выходных данных: В результате вызова сервиса, посылается строка, соответствующая названию месяца (на русском языке, верхний регистр букв, буквы разделены дефисами).

В случае, если параметр не удовлетворяет заданным условиям - посылается сообщение "INCORRECT INPUT DATA".

 

Пример выполнения задания:

Входной параметр:

0

 

Выходные данные:

"INCORRECT INPUT DATA"

 

Входной параметр:

1

 

Выходные данные:

"Я-Н-В-А-Р-Ь"

