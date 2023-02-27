package homework10;
//1. Створити клас FileData. Клас представляє конкретний файл і складається з: ім'я файлу, розміру в байтах, шлях до файлу.

import java.util.Comparator;
import java.util.Objects;

public class FileData {

    public String name;
    public int size;
    public String path;


    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public int getSize() {
        return this.size;
    }


    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }

    //Для коректної роботи хештейбл
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return size == fileData.size && Objects.equals(name, fileData.name) && Objects.equals(path, fileData.path);
    }

    @Override
    //в хешкод лише шлях, щоби файли з однаковим шляхом утворювали список
    public int hashCode() {
        return Objects.hash(path);
    }

}
