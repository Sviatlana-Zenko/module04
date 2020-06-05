/*
 * Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().                                         +
 * Создать второй класс, агрегирующий массив типа Customer, с
 * подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной
 * карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится
 * в заданном интервале.
 */

package by.java_online.module04.simple_class_and_object.task08.main;

import by.java_online.module04.simple_class_and_object.task08.entity.Customer;
import by.java_online.module04.simple_class_and_object.task08.entity.CustomerBase;
import by.java_online.module04.simple_class_and_object.task08.logic.CustomerBaseLogic;
import by.java_online.module04.simple_class_and_object.task08.view.CustomerBaseView;

public class Main {
    public static void main(String[] args) {
        CustomerBaseView view = new CustomerBaseView();
        CustomerBaseLogic logic = new CustomerBaseLogic();

        CustomerBase base = new CustomerBase("Online customers");

        base.addCustomerToBase(new Customer(1211, "Petrov", "Sergey", "Sergeevich", "Brest",
                                            1548325691244578L, "BY88ABCD54865125353287593541"));

        base.addCustomerToBase(new Customer(1213, "Ivanov", "Petr", "Petrovich", "Grodno",
                                            4545323268689898L, "BY51ABCD12345125351487592516"));

        base.addCustomerToBase(new Customer(1214, "Petrov", "Sergey", "Konstantinovich", "Zhlobin",
                                            5264954132659421L, "BY55ABCD56811125824587532841"));

        base.addCustomerToBase(new Customer(1215, "Ivanov", "Ivan", "Ivanovich", "Minsk",
                                            1234432112344321L, "BY12ABCD20202020202020202020"));

        base.addCustomerToBase(new Customer(1216, "Abramova", "Elena", "Viktorovna", "Brest",
                                            2148324598541414L, "BY61ABCD61472020000020200933"));

        base.addCustomerToBase(new Customer(1217, "Yankovskaya", "Galina", "Egorovna", "Minsk",
                                            2154862597742323L, "BY01ABCD11111125832547532811"));


        view.printFullListOfCustomers(base);

        System.out.println("Customers sorted by name:");
        logic.sortCustomersByFullName(base.getCustomers());
        view.printFullListOfCustomers(base);

        long bound1 = 1230000000000000L;
        long bound2 = 2160000000000000L;

        System.out.println("Customers that have card number in the " +
                           "range from " + bound1 + " to " + bound2 + ":");

        view.printCustomersByCardNumber(logic.getCustomersByCardNumber(base.getCustomers(), bound1, bound2));
    }
}
