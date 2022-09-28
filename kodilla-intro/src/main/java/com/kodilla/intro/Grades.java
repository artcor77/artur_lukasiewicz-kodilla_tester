package com.kodilla.intro;

public class Grades {
        private int[] grades;
        private int size;
        private double sum;

    public Grades() {
            this.grades = new int[10];
            this.size = 0;
            double sum = 0;

        }
        public void add ( int value){
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }
        public int lastValue () {
            int result = this.grades[this.size - 1];
            return result;
        }

        public int average() {
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            sum /= grades.length;
            // Sposób znaleziony w tutorialu. Nie wiem, czy odpowiedni na tym etapie.
            return average();
        }

}

