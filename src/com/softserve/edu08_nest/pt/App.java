package com.softserve.edu08_nest.pt;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

         Department department = new Department("Dnipro", "st.Kvitka", 90, "Ivan");

         Department copyOfdepartment = (Department) department.clone();

        System.out.println(department);
        System.out.println(copyOfdepartment);

        copyOfdepartment.setName("Zahar");

        System.out.println(department); // не зрозумів чому не вийшло ластівкового  хвоста з джерелом даних. По уроку мав би бути хвіст, та однакове ім'я
        System.out.println(copyOfdepartment);

    }
}
