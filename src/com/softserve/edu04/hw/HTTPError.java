package com.softserve.edu04.hw;

import java.util.Scanner;

public enum HTTPError {
    HTTP_400("HTTP 400 Bad Request" ,"Сервер не може обробити запит, тому що не розуміє його. \nНаприклад, через синтаксичну помилку."),
    HTTP_401("HTTP 401 Unauthorized","Сервер не може обробити запит без аутентифікації. \nПотрібно додати до заголовків запиту поле" +
            "  Authorization  або перевірити правильність даних у цьому полі, якщо воно вже присутнє."),
    HTTP_402("HTTP 402 Payment Required", "Спочатку цей код повинен був використовуватися у платіжних системах, \nале наразі не використовується."),
    HTTP_403("HTTP 403 Forbidden", "Сервер відмовляється обробити запит, тому що у користувача немає прав на перегляд вмісту."),
    HTTP_404("HTTP 404 Not Found", "Сервер не може знайти запитуваний ресурс."),
    HTTP_405("HTTP 405 Method Not Allowed", "Зазначений в запиті метод не можна використовувати. \nСервер ЗОБОВ’ЯЗАНИЙ вказати доступні методи в заголовку Allow."),
    HTTP_406("HTTP 406 Not Acceptable", "На сервері немає контенту, який відповідає зазначеним у заголовках запиту характеристикам."),
    HTTP_407("HTTP 407 Proxy Authentication Required", "У цього коду така ж логіка, що й у 401 Unauthorized,\n але в цьому випадку клієнт повинен авторизуватися для використання проксі."),
    HTTP_408("HTTP 408 Request Timeout", "Сервер не отримав запит повністю протягом максимально допустимого для цього часу. \nТакий код може виникнути при передачі" +
            " даних великого обсягу методом  PUT  або  POST"),
    HTTP_409("HTTP 409 Conflict", "Сервер не зміг обробити запит через те, що \nвміст цього запиту вступив у конфлікт з параметрами сервера." +
            " Таке може статися, якщо два клієнта одночасно намагаються змінити ресурс за допомогою методу  PUT"),
    HTTP_410("HTTP 410 Gone", "Запит не може бути оброблено, тому що ресурс було видалено. Нове розташування ресурсу при цьому невідомо."),
    HTTP_411("HTTP 411 Length Required", "Сервер відмовляється обробляти запит, \nпоки в його заголовках не буде вказано значення у полі  Content-Length ."),
    HTTP_412("HTTP 412 Precondition Failed", "Сервер не може обробити запит, тому що в його заголовках зазначена умова, яку не може бути виконано."),
    HTTP_413("HTTP 413 Payload Too Large", "Тіло запиту перевищує максимально допустимий розмір, який сервер може прийняти."),
    HTTP_414("HTTP 414 URI Too Long", "URI перевищує максимально допустиму довжину. \nТаке може статися, якщо вибрана неправильний метод ( GET  замість  POST )."),
    HTTP_415("HTTP 415 Unsupported Media Type", "Сервер відмовляється обробити запит, тому що його вміст містить дані у неприпустимому для такого методу форматі."),
    HTTP_416("HTTP 416 Range Not Satisfiable", "У полі  Range  вказано неприпустимий для ресурсу діапазон."),
    HTTP_417("HTTP 417 Expectation Failed", "Сервер не може виконати умову в полі  Expect  у заголовках запиту."),
    HTTP_418("HTTP 418 I’m a teapot", "Повідомлення, яке повинен відправляти чайник для заварювання чаю, якщо на ньому намагаються заварити каву.\n " +
            "Цей код помилки був введений як першоквітневий жарт у 1998 році."),
    HTTP_422("HTTP 422 Unprocessable Entity", "Синтаксис запиту правильний, але через логічної помилки сервер не може його виконати.\n " +
            "Такий код помилки може виникнути, якщо запит містить XML-документ з логічною помилкою."),
    HTTP_423("HTTP 423 Locked", "Запитуваний ресурс заблокований для запитів з таким методом."),
    HTTP_424("HTTP 424 Failed Dependency", "Сервер не зміг виконати запит, тому що запитувана в ньому дія залежала від іншого дії, яку не було виконано."),
    HTTP_426("HTTP 426 Upgrade Required", "Сервер відмовляється обробляти запит, \nвикористовуючи поточний протокол, але може зробити це після переходу на його іншу версію. " +
            "Сервер ЗОБОВ’ЯЗАНИЙ вказати в заголовках відповіді необхідну версію протоколу у полі  Upgrade ."),
    HTTP_499("HTTP 499 Client Closed Request", "Нестандартний код для Nginx, щоб позначити ситуацію, в якій клієнт закрив з’єднання, поки Nginx обробляв запит.");

    private String name;
    private String description;
    private HTTPError(){

}
    HTTPError(String name, String description){
    this.name = name;
    this.description = description;
}
    public  String getInfo(){
    return "\nError code: " + name + "\n" + description;
}
    public static void HW3(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter client code error (4xx Client Error), please: ");
    String input = scanner.nextLine();
    String result = switch (input){
        case "400" -> HTTP_400.getInfo();
        case "401" -> HTTP_401.getInfo();
        case "402" -> HTTP_402.getInfo();
        case "403" -> HTTP_403.getInfo();
        case "404" -> HTTP_404.getInfo();
        case "405" -> HTTP_405.getInfo();
        case "406" -> HTTP_406.getInfo();
        case "407" -> HTTP_407.getInfo();
        case "408" -> HTTP_408.getInfo();
        case "409" -> HTTP_409.getInfo();
        case "410" -> HTTP_410.getInfo();
        case "411" -> HTTP_411.getInfo();
        case "412" -> HTTP_412.getInfo();
        case "413" -> HTTP_413.getInfo();
        case "414" -> HTTP_414.getInfo();
        case "415" -> HTTP_415.getInfo();
        case "416" -> HTTP_416.getInfo();
        case "417" -> HTTP_417.getInfo();
        case "418" -> HTTP_418.getInfo();
        case "422" -> HTTP_422.getInfo();
        case "423" -> HTTP_423.getInfo();
        case "424" -> HTTP_424.getInfo();
        case "426" -> HTTP_426.getInfo();
        case "499" -> HTTP_499.getInfo();
        default -> "This code not found.";
    };
    System.out.println(result);
    }
}
