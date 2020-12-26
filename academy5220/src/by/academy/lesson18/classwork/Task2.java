package by.academy.lesson18.classwork;

public class Task2 {
//	1.	Необходимо создать три потока, которые изменяют один и тот же объект. 
//	Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1. 
//	a) Создать класс расширяющий Thread. 
//	б) Переопределить метод run() - здесь будет находиться синхронизированный блок кода. 
//	в) Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект. 
//	г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в). 
//	д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1. 
//	е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’. Затем создайте три экземпляра объекта нашего класса и запустите потоки.
	public static void main(String... args) {

		StringBuilder sb = new StringBuilder();
		sb.append('a');

		CharacterChanger c1 = new CharacterChanger(sb);
		CharacterChanger c2 = new CharacterChanger(sb);
		CharacterChanger c3 = new CharacterChanger(sb);

		c1.start();
		c2.start();
		c3.start();

	}
}
