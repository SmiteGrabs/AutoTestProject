package Lesson4;

public class IllegalArgumentException extends Exception
{
    public IllegalArgumentException()
    {
        System.out.println("Добавлен массив состоящий не из 3 элементов");
    }
}
