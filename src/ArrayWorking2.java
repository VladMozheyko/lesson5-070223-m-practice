public class ArrayWorking2 {
        private Object[] arr = new Object[5];                 // Создаем массив с 5 элементами
        private int count = 0;                          // Указатель(cursor) на свободный элемент массива

        public void add(Object value){
            if(count > arr.length*0.8){                 // Проверяем, если в массиве элементы занимают более 80% места, выделяем ноаую память
                System.out.println("Выделяем дополнительную память");
                Object[]temp = arr;                          // Копируем старый массив
                arr = new Object[arr.length*2];            // Удваиваем память в текущем массиву
                copyArray(temp);                        // Переносим значения из старого массива, в новый
            }
            arr[count] = value;                         // Вставка в свободный элемент
            count++;                                   // смещение указателя на следующий свободный элемент
        }

        private void copyArray(Object[] temp) {
            for (int i = 0; i < temp.length; i++) {     // Перенос значений из старого массива в новый
                arr[i] = temp[i];
            }
        }

        public void delete(int pos){
            if(pos > count){
                return;                             // Выходим, если номер элемента пустой
            }
            for (int i = pos; i < count; i++) {
                arr[i] = arr[i+1];                 // Сдвигаем элементы
            }
            count--;                              // Учитываем удаленный элемент в курсове
        }

        public int search(Object value){
            for (int i = 0; i < count; i++) {
                if(arr[i] == value){              // Перебираем массив и возвращаем индекс элемента
                    return i;
                }
            }
            return -1;                            // Если элемент не нашли, то возвращаем -1
        }

        public void displayArray(){               // Отображаем массив
            System.out.println("Массив: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public void displayMemory() {             // Отображаем выделенную память
            System.out.println("Выделенная память: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public void clear(){
            count = 0;                   // Удаляем массив - делаем курсор равным нулю
        }

        public void hack(){
            System.out.println("Произошел взлом:)");
            count = arr.length;            // Условно взломали наш массив
        }

        public void erase(){
            System.out.println("Стерли массив. Можно спать спокойно");
            for (int i = 0; i < count; i++) {
                arr[i] = 0;                   // Стирание - явно перезаписали все элементы массива
            }
            count = 0;
        }
}
