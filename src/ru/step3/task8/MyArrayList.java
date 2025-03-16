package ru.step3.task8;


public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public void add(String element) {
        this.array[this.size] = element;
        this.size++;
        if (this.array.length == this.size) {
            this.increaseArrayList();
        }
    }

    private void increaseArrayList() {
        String[] tmpArray = new String[this.size * 2];
        for (int i = 0; i < this.size; i++) {
            tmpArray[i] = this.array[i];
        }
        this.array = tmpArray;
    }

    public void remove(int index) {
        for (int i = index; i < this.size; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
    }

    public void remove(String element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(element)) {
                this.remove(i);
                return;
            }
        }
    }

    public void showArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(i + "\t" + this.array[i]);
        }
    }
}
