package homework10;
import java.util.*;
//0. Створити клас FileNavigator. Клас призначений для зберігання списку файлів, які розташовані на конкретному шляху.
//Наприклад: /path/to/file-> [files.txt, firstApp.java]

public class FileNavigator {

    public final Map<String, ArrayList<FileData>> files = new HashMap<>();

    public FileNavigator() {
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "files=" + files +
                '}';
    }

//2. Реалізувати метод add у класі FileNavigator. Цей метод додає файл за вказаним шляхом. Якщо шлях вже існує, новий файл необхідно
//додати до списку, вже пов'язаному з відповідним шляхом. ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.

//7. ** Реалізувати перевірку консистентності у методі add у класі FileNavigator.
//Не дозволяти додавати значення і повідомити про це в консолі, при спробі додати значення FileData
// значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
//Цей пункт виконується тим, що в метод add() ми передаємо лише файл, а не шлях+файл. Таке виконання здається більш лаконічним
    public void add(FileData file) {
        System.out.println("Result of method add():");
        if (files.containsKey(file.path)) {
            System.out.println("File "+file.name+" was added to existed key "+file.path);
            files.get(file.path).add(file);
        } else {
            System.out.println("File "+file.name+" was added to new key "+file.path);
            ArrayList arl = new ArrayList();
            arl.add(file);
            files.put(file.path, arl);
        }
    }

//3. Реалізувати метод find у класі FileNavigator. Метод повертає список файлів, пов'язаних з шляхом переданим як параметр.
    public ArrayList find(String path) {
        System.out.println("Result of method find():");
        if (files.containsKey(path)) {
            System.out.println("Files with path "+path+": "+files.get(path));
            return files.get(path);
        } else {
            System.out.println("No files with "+path+" was found");
            return null;
        }
    }

//4. Реалізувати метод filterBySize у класі FileNavigator.
//Метод повертає список файлів, розмір (в байтах) яких не перевищує значення, передане як параметр.
    public ArrayList filterBySize(int size) {
        System.out.println("Result of method filterBySize():");
        ArrayList arl = new ArrayList();
        for (ArrayList<FileData> fda : files.values()) {
            for (FileData fd : fda) {
                if (fd.size<size) {
                    arl.add(fd);
                }
            }
        }
        if (arl.size()>0) {
            System.out.println("We have "+arl.size()+" files with size less then "+size+"\n"+arl);
        } else {
            System.out.println("There is no files less then "+size);
        }
        return arl;
    }

//5. Реалізувати метод remove у класі FileNavigator.
//Метод видаляє шлях і пов'язані з ним файли, виходячи з значення шляху, переданого як параметр.
    public void remove(String path) {
        System.out.println("Result of method remove():");
        if (files.containsKey(path)) {
            System.out.println(files.get(path).size()+" files were removed with key "+path);
        } else {
            System.out.println("No files with path "+path);
        }
        files.remove(path);
    }
//6. * Реалізувати метод sortBySize у класі FileNavigator.
// Метод сортує всі наявні файли за розміром (за зростанням), потім повертає список відсортованих файлів.
    public ArrayList sort() {
        ArrayList arl = new ArrayList();
        for (ArrayList<FileData> fda : files.values()) {
            for (FileData fd : fda) {
                arl.add(fd);
            }
        }
        Comparator<FileData> comparator = Comparator.comparing(FileData -> FileData.getSize());
        arl.sort(comparator);
        System.out.println("Result of method sort():\n"+arl);
        return arl;
    }
}
