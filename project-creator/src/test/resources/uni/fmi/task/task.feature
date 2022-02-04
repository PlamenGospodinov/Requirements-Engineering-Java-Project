Feature: Управление на задачи

  Scenario Outline: Създаване на задача
    Given Участникът е отворил проект и натиска бутона за създаване на задача
    When Въведе заглавие "<title>"
    And Въведе съдържание "<content>" в полето съдържание
    And Въведе статус "<status>" в полето за статус 
    And Въведе назначен по задачата "<assignedPerson>" в полето за назначен
    And Натиска бутона за създаване
    Then Вижда съобщение "<message>"

    Examples: 
      | title       |  content               | status     | assignedPerson           |   message                        |
      | Front-End   |The front-end of the app| new        | Радостин Тихомиров        |Създадохте задача успешно!        |
      |             |The front-end of the app| in progress| Инес Радева               |Въведете заглавие на задачата!    |
      | Back-End    |                        | rejected   | Янко Колев                |Въведете описание на задачата!    |
      | Server      |Server side             |            | Инес Радева               |Въведете статус на задачата!      |
      | Cloud       |Pa                      | new        | Радостин Тихомиров        |Съдържанието трябва да е по-дълго от 7символа! |
      | HR          |Recruitment task        | finished   |                           |Въведете участник отговорен за задачата!       |
      |             | 							         |            |                           |Въведете данни за задачата!       |

	Scenario Outline: Смяна на статус на задача
    Given Участникът е отворил задача и натиска бутона за редакция на задача
    When Въведе заглавие на проект за редакция "<title>"
    And Въведе статус "<oldStatus>" в полето статус
    And Въведе нов статус "<newStatus>" в полето за нов статус 
    And Натиска бутона за редакция
    Then Вижда съобщение от редакция "<message>"
    
    Examples: 
      | title       |  oldStatus               | newStatus  |   message                         |
      | Front-End   | new                      | rejected   | Редактирахте задача успешно!        |
      |             | new                      | in progress| Въведете заглавие на задачата!    |
      | Back-End    |                          | rejected   | Въведете статус на задачата!    |
      | Server      |in progress               |            | Въведете нов статус на задачата!      |
      | HR          |finished                  | in progress| Не може да смените статуса на завършена задача!       |
      |             | 							           |            | Въведете данни за задачата!       |
      | Sth         |new 							         | in progress| Задача с такова име няма!          |