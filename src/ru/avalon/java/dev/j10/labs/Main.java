package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         */
        
        /* 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
       
        Passport ivanovPassport = new Passport("4444 777777", "Иван", "Иванов", "Петрович", "04.05.1987", "05.06.2009", "УВД г. Москва" );
        Address ivanovAddress = new Address("663300", "Россия", "Норильск", "Комсомольская", 3, 26);
        Person ivanov = new Person(ivanovPassport, ivanovAddress);

        Passport smithPassport = new Passport("5555 888888", "John", "Smith", "Edvard", "01.02.2002", " HM Government" );
        Address smithAddress = new Address("AB10", "Great Britain", "Ferryhill", "Dean RD", 5, 33);
        Person smith = new Person(smithPassport, smithAddress);
   
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        String ivanovname = ivanov.getFullName();
        String smithname = smith.getFullName();
        String ivanovadr = ivanov.getAddress();
        String smithadr = smith.getAddress();
        

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        
        System.out.println(ivanovname);
        System.out.println(ivanovadr);
        System.out.println(smithname);
        System.out.println(smithadr);
    }
}
