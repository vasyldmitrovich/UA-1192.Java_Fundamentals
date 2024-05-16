package com.softserve.edu06;

public class Objects {
    public static void main(String[] args) {
        //варіант 1 створення конструктора з обєкту
     /* Dog myDog = new Dog();
        System.out.println(myDog.name);
        System.out.println(myDog.age);*/

        //варіант 2 створення конструктора з обєкту
       /* Dog myDog = new Dog(7);
        System.out.println(myDog.age);*/

        //варіант 2 створення конструктора з обєкту
       /* Dog myDog = new Dog("lionuk", 16);
        System.out.println(myDog.name + " " + myDog.age);*/


        //створення geters and setters для змінних name і age

       /* Human human1 = new Human();
        human1.setName("pit");
        human1.setAge(16);
        human1.getInfo();
    }
}
        class Human {

            String name;
            int age;

            public void setName(String theName) {
                name = theName;
            }

            public void setAge(int myAge) {
                age = myAge;
            }
            public String getName(){
                return name;
            }
            public int getAge(){
                return age;
            }
            public void getInfo(){
                System.out.println(name + " " + age);
            }
        }*/

        Human human1 = new Human();
        human1.setName("pit");
        human1.setAge(16);
        human1.getInfo();
    }
}

        class Human {

            String name;
            int age;

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public void getInfo() {
                System.out.println(name + " " + age);
            }
        }
