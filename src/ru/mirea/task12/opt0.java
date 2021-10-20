package ru.mirea.task12;

public class opt0 {
    static class Student{
        private int id;
        Student(){
            this.id = (int)(Math.random() * 10001);
        }
        Student(int id){
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + this.id +
                    '}';
        }

        public int getId() {
            return this.id;
        }
    }

    public static void main(String[] args) {
        //Заполняем
        Student[] studArr=new Student[20];
        for (int i=0;i<20;i++) {
            studArr[i] = new Student();
            System.out.print(studArr[i].getId()+" ");
        }
        //Сортировка вставками
        for (int i=0;i<20;i++)
        {
            Student temp=studArr[i];
            int j=i-1;
            for (; j >= 0; j--)
                if (temp.getId() < studArr[j].getId())
                    studArr[j + 1] = studArr[j];
                else break;
            studArr[j + 1]=temp;
        }
        //Конец сортировки
        System.out.println();
        for (int i = 0;i < 20;i++)
            System.out.print(studArr[i].getId()+" ");

    }
}
