package homework9;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class workingWithLists {


    public static void findOccurance(ArrayList<String> list) {
//Найбільш схожа структура на JSON, яку вдалось нагуглити
        HashMap<String, Integer> words = new HashMap<>();

        for (var i = 0; i<list.size(); i++) {
            if (words.containsKey(list.get(i)) == false) {
                words.put(list.get(i), 1);
            } else {
                words.put(list.get(i), words.get(list.get(i)) + 1);
            }
        }
        System.out.println("findOccurance(): for List "+list);
        System.out.println(words);
    }

    public static void calcOccurance(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<>();
        for (var i = 0; i<list.size(); i++) {
            if (result.indexOf(list.get(i)) == -1) {
                result.add(list.get(i));
                count.add(1);
            } else {
                count.set(result.indexOf(list.get(i)), count.get(result.indexOf(list.get(i)))+1);
            }
        }
        System.out.println("calcOccurance(): for List "+list);
        for (var i = 0; i<result.size(); i++) {
            System.out.println(result.get(i)+" - "+count.get(i));
        }
    }

    public static ArrayList findUnique(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (var i = 0; i<numbers.size(); i++) {
            if (result.indexOf(numbers.get(i)) == -1) {
                result.add(numbers.get(i));
            }
        }
        System.out.println("findUnique(): Отримали на вхід "+numbers.size()+" елементів, а повернули "+result.size()+" унікальних");
        return result;
    }

    public static int countOccurance(ArrayList<String> list, String target) {
        int result = 0;
        for (var i = 0; i<list.size(); i++) {
            if (list.get(i).equals(target)) {result++;}
        }
        System.out.println("countOccurance(): В заданому списку з "+list.size()+" елементів слово "+target+" зустрічається "+result+" разів");
        return result;
    }

    public static ArrayList toList(String args[]) {
        ArrayList<String> result = new ArrayList<String>();
        for (var i = 0; i< args.length; i++) {
            result.add(args[i]);
        }
        if (args.length == 0) {
            System.out.println("toList(): пустий масив");
        } else {
            System.out.println("toList(): "+args.length+" елементів переведено в ArrayList - "+result);
        }
        return result;
    }
}
