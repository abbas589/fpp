package com.miu.fpp.finalprep;

import java.util.List;
import java.util.Map;

public class NHashTable {

    private NLinkedList[] table;
    private int size;
    private static final int INITIAL_SIZE = 10;

    private int tableSize;

    public NHashTable() {
        this(INITIAL_SIZE);

    }

    public NHashTable(int n) {
        table = new NLinkedList[n];
    }

    public void put(Object key, Object value) {
        if (key == null) return;

        int hashCode = key.hashCode();
        int idx = hash(hashCode);
        Entry entry = new Entry(idx, value);

        if (table[idx] == null) {
            table[idx] = new NLinkedList();
        }
        table[idx].insert(entry);

    }

    public void putNoDuplocate(Object key, Object value) {
        if (key == null) return;

        int hashCode = key.hashCode();
        int index = hash(hashCode);

        boolean isDuplicate = false;

        if (table[index] != null) {
            NNode e = table[index].head;
            while (e.next != null) {
                Entry data = (Entry) e.data;
                if (data.key.equals(key)) {
                    isDuplicate = true;
                    break;
//                    return;
                }
                e = e.next;
            }
        }

        if(!isDuplicate){
            if(table[index]==null){
                table[index] = new NLinkedList();
            }
            table[index].insert(new Entry(key,value));
        }
    }

    public int hash(int n) {
        n = Math.abs(n);
        return n % tableSize;
    }

    public class Entry {
        Object key;
        Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

}
