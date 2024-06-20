package com.softserve.edu08.hw.hw1;

    public class Student extends Person implements Cloneable {
        public Student() {
        }

        public Student(FullName fullName, int age) {
            super(fullName, age);
        }

        @Override
        public String info() {
            return super.info() + "\n" + activity() ;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Student stClone = (Student) super.clone();
            return stClone;
        }

        @Override
        public String activity() {
            return "I study at university";
        }

    }

