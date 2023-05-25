public class Main {

    /*
    План занятия
    1) Массивы
    2) Бинарный поиск
     */

    /*
    Структура данных - способ расположения и обработки данных в памяти.
    Каждая структура данных, подразумевает определнный алгоритм для работы с собой
    Для различных задач существуют различные структуры данных.
    Самой популярной структурой данных является массив(array)
    Массив струдкутра данных, которая послеовательно располагает данные в памяти

    Сложность алгоритма - количество действий, которое нужно выполнить для решения поставленной задачи.
    Как правило сложность напрямую зависит от размера структуру данных и может выражаться в какой-то формуле:
    например: квадратичная сложность будет требовать количество операций равное квадрату элементов структуры, т.е.
    структура имеет 10 элементов, сложность составит 10^2 = 100(квадратичная сложность).

    Массив эффективен для получения доступа к элементу - постоянная сложность получения доступа к элементу и требует всего
    одного действия. Для того чтобы получить доступ к элементу массива, достаточно знать его индекс, т.е. указать номер элемента-
    операционная система возьмет размер элемента, умножит его на индекс прибавит к адресу нулевого индекса массива и предоставит
    доступ к адресу искомого элемента

    В нашем примере ArrayWorking подходит только для int-ов, но операции, которые он делает, не изменятся для других типов
    данных, таким образом можно просто его скопировать, поменять везде типы на интересующий нас тип и получить рабочий класс.
    Чтобы избежать копирования такие задачи решаются обобщенно, т.е. для некого общего типа, а потом при необходимости вместо
    общего типа подставляется требуемый тип.

    Давайте сделаем обобщенный класс для работы с массивом - ArrayWorking2.

    Для этого воспользуемся классом Object. Все в Java произошло от Object. Мы знаем, что родителю всегда можно присвоить
    объект потомка, например:
    Человек - родитель
    Программист - потомок
    Программист всегда является человеком, поэтому для человека можно вызвать конструктор программиста, но не наоборот,
    т.е. не каждый человек является программистом.

    Поскольку Object родитель любого Java-класса, то нему можно приравнять все что угодно.
     */

    /*
    Заметки
    O(формула сложности) - в литературе так принято обозначать сложность алгоритма - читается "O - большое", например:
    O(n²) - квадратичная сложность
    O(1) - фиксированная сложность
     */

    public static void main(String[] args) {
        ArrayWorking arrayWorking = new ArrayWorking();
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        arrayWorking.delete(1);
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        System.out.println(arrayWorking.search(5));
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.displayArray();
        arrayWorking.displayMemory();

        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.add(5);
        arrayWorking.add(7);
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        arrayWorking.clear();
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        arrayWorking.hack();
        arrayWorking.displayArray();
        arrayWorking.erase();
        arrayWorking.displayArray();
        arrayWorking.displayMemory();
        arrayWorking.hack();
        arrayWorking.displayArray();
        arrayWorking.displayMemory();

        ArrayWorking2 arrayWorking2 = new ArrayWorking2();
        arrayWorking2.add(9);
        arrayWorking2.add(5.6);
        arrayWorking2.add("Привет");
        arrayWorking2.displayArray();


    }
}
