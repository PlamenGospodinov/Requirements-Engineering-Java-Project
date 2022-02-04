Feature: Създаване на проект

  Scenario Outline: Създаване на проект
    Given Потребителя отваря екрана за създаване на проект
    When Въведе име на проект "<projectName>"
    And Въведе описание на проект "<description>" в полето описание
    And Въведе създател на проект "<creator>" в полето създател `	
    And Натиска бутона за създаване
    Then Вижда съобщение "<message>"

    Examples: 
      | projectName  |  description                | creator         |   message                     |
      | projectOne   |DescriptionOne is here.Test12| Иван Иванов     | Създадохте проект успешно!    |
      |              |DescriptionOne is here.Test14| Мишо Иванов     | Въведете име на проекта!      |
      |              |                             |                 | Въведете данни за проекта!    |
      | projectThree |Descriptio                   | Стефан Тихомиров| Описанието трябва да е по-дълго от 10символа!    |
      | projectFive  |                             | Мишо Иванов     | Въведете описание на проекта!     |
      | projectSix   |DescriptionOne is here.Test15|                 | Въведете създател на проекта! |
			| projectOne   |DescriptionOne is here.Test12| Иван Иванов     | Проект с такова име вече съществува!    |
      
      
      
      Scenario Outline: Създаване на проект в проекта
    Given Потребителя натиска бутона за нов проект,намиращ се в първоначалния проекта
    When Въведе име на проект1 "<projectName1>"
    And Въведе описание на проект1 "<description1>" в полето описание
    And Въведе създател на проект1 "<creator1>" в полето създател 
    And Натиска бутона за създаване1
    Then Вижда съобщение1 "<message1>"

    Examples: 
      | projectName1  |  description1               | creator1        |   message1                    |
      | projectInside |DescriptionOne is here.Test12| Иван Иванов     | Създадохте проект успешно!    |
      |               |DescriptionOne is here.Test14| Мишо Иванов     | Въведете име на проекта!      |
      |               |                             |                 | Въведете данни за проекта!    |
      | projectThree  |Descriptio                   | Стефан Тихомиров| Описанието трябва да е по-дълго от 10символа!    |
      | projectFive   |                             | Мишо Иванов     | Въведете описание на проекта!     |
      | projectSix    |DescriptionOne is here.Test15|                 | Въведете създател на проекта! |