class Student{
    int rno;
    String name;
    void display()
    {
        System.out.println("Student roll no is: "+rno+" and name is: "+name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rno = 123;
        s1.name = "abc";
        s2.rno = 111;
        s2.name = "xyz";
        s1.display();
        s2.display();
    }
}