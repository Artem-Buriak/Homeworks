package phonebook;

import java.util.ArrayList;

public class Directory {
    public ArrayList<Record> records = new ArrayList<>();

    public void add(String name, String phone) {
        Record record = new Record(name, phone);
        records.add(record);
    }

    public Record find(String name) {
        for (var i = 0; i<records.size(); i++) {
            if (records.get(i).name.equals(name)) {
                System.out.println("find(): "+records.get(i).name+" - "+records.get(i).phone);
                return records.get(i);
            }
        }
        return null;
    }

    public ArrayList findAll(String name) {
        ArrayList<Record> result = new ArrayList<>();

        for (var i = 0; i<records.size(); i++) {
            if (records.get(i).name.equals(name)) {
                System.out.println("findAll(): "+records.get(i).name+" - "+records.get(i).phone);
                result.add(records.get(i));
            }
        }
        if (result.size()>0) {
            return result;
        } else {
            return null;
        }
    }
}
