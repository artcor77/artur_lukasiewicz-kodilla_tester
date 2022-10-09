package com.kodilla.intro;

public class Grades {
        private int[] grades;
        private int size;
    public Grades() {
            this.grades = new int[10];
            this.size = 0;
            double sum = 0;
        }
        public void add(int value){
            if(this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }
        public int lastValue() {
            int result = this.grades[this.size - 1];
            return result;
        }
        public double average() {
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            sum /= grades.length;
            return sum;
        }
}

